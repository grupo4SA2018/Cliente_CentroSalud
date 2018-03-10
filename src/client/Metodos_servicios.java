/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import serviciosweb.SQLException_Exception;

/**
 *
 * @author favio
 */
public class Metodos_servicios {

    public static String registroEnfermedad(java.lang.String nombre) throws SQLException_Exception {
        serviciosweb.Enfermedad_Service service = new serviciosweb.Enfermedad_Service();
        serviciosweb.Enfermedad port = service.getEnfermedadPort();
        return port.registroEnfermedad(nombre);
    }

    public static String registroMedicamento(java.lang.String nombre) throws SQLException_Exception {
        serviciosweb.Medicamento_Service service = new serviciosweb.Medicamento_Service();
        serviciosweb.Medicamento port = service.getMedicamentoPort();
        return port.registroMedicamento(nombre);
    }

    public static String consultarPaciente(java.lang.String dpi) throws SQLException_Exception {
        serviciosweb.Paciente_Service service = new serviciosweb.Paciente_Service();
        serviciosweb.Paciente port = service.getPacientePort();
        return port.consultarPaciente(dpi);
    }

    public static String registroPaciente(java.lang.String dpi, java.lang.String nombrePaciente, java.lang.String fechaNac, int genero, java.lang.String direccion, java.lang.String telefono, int estado, java.lang.String correo) throws SQLException_Exception {
        serviciosweb.Paciente_Service service = new serviciosweb.Paciente_Service();
        serviciosweb.Paciente port = service.getPacientePort();
        return port.registroPaciente(dpi, nombrePaciente, fechaNac, genero, direccion, telefono, estado, correo);
    }

    public static String registroDoctor(java.lang.String nombre, java.lang.String licenciaMedica, java.lang.String fechaNac, java.lang.String especialidad) throws SQLException_Exception {
        serviciosweb.Doctor_Service service = new serviciosweb.Doctor_Service();
        serviciosweb.Doctor port = service.getDoctorPort();
        return port.registroDoctor(nombre, licenciaMedica, fechaNac, especialidad);
    }

    public static String registroCentroSalud(java.lang.String nombre, java.lang.String direccion) throws SQLException_Exception {
        serviciosweb.CentroSalud_Service service = new serviciosweb.CentroSalud_Service();
        serviciosweb.CentroSalud port = service.getCentroSaludPort();
        return port.registroCentroSalud(nombre, direccion);
    }

    public static String consultarDoctores() throws SQLException_Exception {
        serviciosweb.Doctor_Service service = new serviciosweb.Doctor_Service();
        serviciosweb.Doctor port = service.getDoctorPort();
        return port.consultarDoctores();
    }

    public static String consultarDoctor(java.lang.String idDoctor) throws SQLException_Exception {
        serviciosweb.Doctor_Service service = new serviciosweb.Doctor_Service();
        serviciosweb.Doctor port = service.getDoctorPort();
        return port.consultarDoctor(idDoctor);
    }

    public static String historialPaciente(java.lang.String dpi) throws SQLException_Exception {
        serviciosweb.Paciente_Service service = new serviciosweb.Paciente_Service();
        serviciosweb.Paciente port = service.getPacientePort();
        return port.historialPaciente(dpi);
    }

    public static String obtenerIdPaciente(java.lang.String dpi) throws SQLException_Exception {
        serviciosweb.Paciente_Service service = new serviciosweb.Paciente_Service();
        serviciosweb.Paciente port = service.getPacientePort();
        return port.obtenerIdPaciente(dpi);
    }

    public static String registroCita(java.lang.String fecha, int realizada, int idPaciente, int idDoctor) throws SQLException_Exception {
        serviciosweb.Cita_Service service = new serviciosweb.Cita_Service();
        serviciosweb.Cita port = service.getCitaPort();
        return port.registroCita(fecha, realizada, idPaciente, idDoctor);
    }

    public static String consultarEnfermedades() throws SQLException_Exception {
        serviciosweb.Enfermedad_Service service = new serviciosweb.Enfermedad_Service();
        serviciosweb.Enfermedad port = service.getEnfermedadPort();
        return port.consultarEnfermedades();
    }

    public static String registroDiagnostico(java.lang.String descripcion, int idEnfermedad) throws SQLException_Exception {
        serviciosweb.Diagnostico_Service service = new serviciosweb.Diagnostico_Service();
        serviciosweb.Diagnostico port = service.getDiagnosticoPort();
        return port.registroDiagnostico(descripcion, idEnfermedad);
    }

    public   static String listadoMedicamento() throws SQLException_Exception {
        serviciosweb.Medicamento_Service service = new serviciosweb.Medicamento_Service();
        serviciosweb.Medicamento port = service.getMedicamentoPort();
        return port.listadoMedicamento();
    }

    private static String consultarReceta(java.lang.String idReceta) throws SQLException_Exception {
        serviciosweb.Receta_Service service = new serviciosweb.Receta_Service();
        serviciosweb.Receta port = service.getRecetaPort();
        return port.consultarReceta(idReceta);
    }

    public static String registroReceta(int cantidad, int idMedicamento) throws SQLException_Exception {
        serviciosweb.Receta_Service service = new serviciosweb.Receta_Service();
        serviciosweb.Receta port = service.getRecetaPort();
        return port.registroReceta(cantidad, idMedicamento);
    }

    
    
    
}
