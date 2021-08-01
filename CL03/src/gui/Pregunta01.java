package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloProductos;
import clase.Producto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Pregunta01 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblStock;
	private JLabel lblPrecio;
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtStock;	
	private JTextField txtPrecio;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPaneA;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	private JScrollPane scrollPaneB;
	private JTextArea txtS;
	private JLabel lblMantenimiento;
	private JLabel lblTituloLista;
	private JLabel lblTituloReporte;
	private JButton btnReportar;
	
	
	ArregloProductos pro = new ArregloProductos();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pregunta01 frame = new Pregunta01();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pregunta01() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pregunta01.class.getResource("/images/business.png")));
		setTitle("Pregunta01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 696);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(11, 72, 40, 28);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(105, 72, 62, 28);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(11, 119, 84, 28);
		contentPane.add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(105, 111, 204, 28);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		lblStock = new JLabel("Stock");
		lblStock.setBounds(11, 161, 55, 28);
		contentPane.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setBounds(105, 161, 62, 28);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrecio.setBounds(11, 200, 50, 28);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(105, 200, 62, 28);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/add.png")));
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(451, 72, 155, 28);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/search.png")));
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(177, 72, 132, 28);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/edit.png")));
		btnModificar.addActionListener(this);
		btnModificar.setBounds(451, 111, 155, 28);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/delete.png")));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(451, 147, 155, 28);
		contentPane.add(btnEliminar);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(11, 287, 594, 172);
		contentPane.add(scrollPaneA);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPaneA.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Descripción");
		modelo.addColumn("Stock");
		modelo.addColumn("Precio"); 
		tblTabla.setModel(modelo);
		
		scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(10, 505, 594, 141);
		contentPane.add(scrollPaneB);
		
		txtS = new JTextArea();
		scrollPaneB.setViewportView(txtS);
		
		lblMantenimiento = new JLabel("MANTENIMIENTO DE PRODUCTOS");
		lblMantenimiento.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/business.png")));
		lblMantenimiento.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMantenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenimiento.setBounds(65, 11, 518, 50);
		contentPane.add(lblMantenimiento);
		
		lblTituloLista = new JLabel("Listado de Productos");
		lblTituloLista.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/bookmark.png")));
		lblTituloLista.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloLista.setBounds(10, 257, 187, 28);
		contentPane.add(lblTituloLista);
		
		lblTituloReporte = new JLabel("Reporte");
		lblTituloReporte.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/chart.png")));
		lblTituloReporte.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloReporte.setBounds(10, 478, 90, 28);
		contentPane.add(lblTituloReporte);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setIcon(new ImageIcon(Pregunta01.class.getResource("/images/copy.png")));
		btnReportar.setBounds(451, 470, 155, 28);
		contentPane.add(btnReportar);
		
		listar();		
	}
	
	//  Declaración global
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
		int codigo = leerCodigo();
		if (pro.buscar(codigo) == null) { 
		}
		else {
			mensaje(" El código ya existe ");
			limpieza();
		}
		
		String descripcion = leerDescripcion();
		int stock = leerStock();
		double precio = leerPrecio();
		
		
		Producto nuevo = new Producto(codigo, descripcion, stock, precio);
		
		pro.adicionar(nuevo);
		listar();
		
		limpieza();
	
		
		
		 
		 
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		
		Producto p = pro.buscar(leerCodigo());
		if (p !=null) {
			txtDescripcion.setText(p.getDescripcion());
			txtStock.setText("" + p.getStock());
			txtPrecio.setText("" + p.getPrecio());
			txtCodigo.requestFocus();			
		} else {
			mensaje ("El codigo " + leerCodigo()  + " No existe");
			txtCodigo.requestFocus();
		}
		
		
		
		 
		
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		
		Producto p = pro.buscar(leerCodigo());
		if (p!=null) {
			String descripcion = leerDescripcion();
			int stock = leerStock();
			double precio = leerPrecio();
			
			p.setDescripcion(descripcion);
			p.setStock(stock);
			p.setPrecio(precio);
			
			listar();
			txtCodigo.requestFocus();
			mensaje ("Los datos fueron modificados con exito");
		} else {
			mensaje ("El codigo " + leerCodigo()  + " No existe");
			txtCodigo.requestFocus();
		}
		 
		 
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		 
		int codigo = leerCodigo();
		if (pro.buscar(codigo) == null) { 
			mensaje(" El código no existe ");
		} else {
			Producto x = pro.buscar(codigo);
			pro.eliminar(x);
			listar();
			mensaje(" El Producto fue eliminado con exito ");
		}
		limpieza();			
	}
	
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		
		txtS.setText("");
		imprimir("Cantidad de Productos: " + pro.tamanio());
		imprimir("Prod. con Mayor Stock: " + pro.pMayorStock()  +   pro.productoMayorStock());
		imprimir("Prod. con Menor Stock: " + pro.pMenorStock() + pro.productoMenorStock());
		imprimir("Suma de Precios Prod.: " + pro.sumaPrecioProducto());
		imprimir("Prec. Prom. de Prod. : " + pro.promedioPrecioProducto());				
		
	}
	
	void imprimir() {
		imprimir("");
	}
	
	//  Métodos tipo void (sin parámetros)
	void limpieza() {
		txtCodigo.setText("");
		txtDescripcion.setText("");
		txtStock.setText("");
		txtPrecio.setText("");
		txtCodigo.requestFocus();
	}	
   	void listar() {
		modelo.setRowCount(0);
		
		for (int i = 0; i < pro.tamanio(); i++) {
			//Por cada objeto se debe crear una fila
			Object[] fila = {
					pro.obtener(i).getCodigo(),
					pro.obtener(i).getDescripcion(),
					pro.obtener(i).getStock(),
					pro.obtener(i).getPrecio()
					
			};
			
			modelo.addRow(fila);
		}
		
		
	}
   	
   	void imprimir(String s) {
		txtS.append(s + "\n");
	}
   	
	//  Métodos tipo void (con parámetros)
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
 
//  Métodos que retornan valor (sin parámetros)
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerDescripcion() {
		return txtDescripcion.getText().trim();
	}
	int leerStock() {
		return Integer.parseInt(txtStock.getText().trim());
	}
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText().trim());
	}
}