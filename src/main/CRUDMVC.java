package main;

import Controlador.CtrlProducto;
import modelo.ConsultasProducto;
import modelo.Producto;
import Vista.frmProducto;


public class CRUDMVC {

    public static void main(String[] args) {

        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();

        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
