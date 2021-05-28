package AppKeepCode;

import DAO.CompanyDAO;
import DAO.UsuariosDAO;
import ProcessoMaq.GetAllProcess;
import ProcessosIDE.ProcessIDE;
import Usuario.UsuarioDatas;

public class KeepCodeAPI {

    public static void main(String[] args) {

        /*  public void chamandoProcessos(Usuario.UsuarioDatas usuario) {*/
        GetAllProcess getAllDatesProcess;
        getAllDatesProcess = new GetAllProcess();
        ProcessIDE processosIDE = new ProcessIDE();

        getAllDatesProcess.getNamePc();
        getAllDatesProcess.getDiscoTotal();
        getAllDatesProcess.getCpuNome();
        getAllDatesProcess.memoriaTotal();

        getAllDatesProcess.insertDatesMaquina();

        processosIDE.putAllNameIde();
        processosIDE.getIdeName();
        processosIDE.getIdeCpu();
        processosIDE.getIdeRam();
        processosIDE.getIdeDisco();
        /* processosIDE.getFkIdMaquina();*/

//        processosIDE.showAll();
        processosIDE.insertIntoValues();

    }

}
