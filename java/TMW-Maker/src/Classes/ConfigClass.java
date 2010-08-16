package Classes;

import java.awt.Toolkit;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;


public class ConfigClass {
    private String Versao = "0.2";
    private String  Barra = System.getProperty("file.separator");
    private String  ConfiguracaoURL = System.getProperty("user.home")+Barra+".tmw-maker.ini";

    private String  ConexaoRepositorio =            "http://themanaworld-br.googlecode.com/svn/trunk";
    private String  ConexaoLocalhost =              System.getProperty("user.home")+Barra+"localhost";
    private String  ConexaoUsuario =                "";
    private String  ConexaoSenha =                  "";
    private String  ExecucaoComando =               "manaplus";
    private String  ExecucaoParametroTMWData =      ConexaoLocalhost+Barra+"tmwdata";
    private String  ExecucaoParametroServidor =     "localhost";
    private String  ExecucaoParametroConta =        ""; //Inicia sem valor
    private String  ExecucaoParametroSenha =        ""; //Inicia sem valor
    private String  ExecucaoParametroPersonagem =   ""; //Inicia sem valor
    private boolean ExecucaoParametroSemopengl =    true; //Inicia Sem OpenGL
    private String  DocumentacaoAlteracoes =        "http://code.google.com/p/tmw-maker/source/list";
    private String  DocumentacaoComponentes =       "http://code.google.com/p/tmw-maker/wiki";
    private String  DocumentacaoComentarios =       "http://code.google.com/p/tmw-maker/issues/entry";
    private String  DocumentacaoTraducoes =         "";

    private long    ComportAtualizacaoEngineUltima =        0;
    private int     ComportAtualizacaoEngineIntervalo =     1; // Diariamente (Cada 1 Dia)
    private long    ComportAtualizacaoLocalhostUltima =     0;
    private int     ComportAtualizacaoLocalhostIntervalo =  1; // Diariamente (Cada 1 Dia)


    public String getVersao(){return Versao;}
    public long getAtualizacaoEngineUltima(){return ComportAtualizacaoEngineUltima;}
    public long getAtualizacaoEngineIntervaloReal(){
        /**
          * 1000 = Milisegundos
          * 60 = Segundos
          * 60 = Minutos
          * 24 = horas
          **/
        return 1000*60*60*24*ComportAtualizacaoEngineIntervalo; //Intervalo de 1 dias
    }
    public int  getAtualizacaoEngineIntervalo(){
        return ComportAtualizacaoEngineIntervalo; //Intervalo de 1 dias
    }
    public long getAtualizacaoEngineFutura(){
        /**
         * Se ComportAtualizacaoEngineIntervalo for <= -1 ? Nunca
         * Se ComportAtualizacaoEngineIntervalo for ==  0 ? Sempre ao Iniciar
         * Se ComportAtualizacaoEngineIntervalo for >= +1 ? Espera
         */
        if(ComportAtualizacaoEngineIntervalo>=0){
            return ComportAtualizacaoEngineUltima+getAtualizacaoEngineIntervaloReal(); //Intervalo de 1 dias
        }else{
            return -1;
        }
    }
    public long getAtualizacaoLocalhostUltima(){return ComportAtualizacaoLocalhostUltima;}
    public long getAtualizacaoLocalhostIntervaloReal(){
        /**
          * 1000 = Milisegundos
          * 60 = Segundos
          * 60 = Minutos
          * 24 = horas
          **/
        return 1000*60*60*24*ComportAtualizacaoLocalhostIntervalo; //Intervalo de 1 dias
    }
    public int  getAtualizacaoLocalhostIntervalo(){
        return ComportAtualizacaoLocalhostIntervalo; //Intervalo de 1 dias
    }
    public long getAtualizacaoLocalhostFutura(){
        /**
         * Se ComportAtualizacaoLocalhostIntervalo for <= -1 ? Nunca
         * Se ComportAtualizacaoLocalhostIntervalo for ==  0 ? Sempre ao Iniciar
         * Se ComportAtualizacaoLocalhostIntervalo for >= +1 ? Espera
         */
        if(ComportAtualizacaoLocalhostIntervalo>=0){
            return ComportAtualizacaoLocalhostUltima+getAtualizacaoLocalhostIntervaloReal(); //Intervalo de 1 dias
        }else{
            return -1;
        }
    }

    public static long getAgora(){
        // um calendar tamb�m � criado com a data atual
        GregorianCalendar calendar = new GregorianCalendar();
        Date data = calendar.getTime();
        return data.getTime();
    }
    public static String AGORAtoFORMATO(String Formato){
        //Formato = "dd/MM/yyyy";
        //Formato = "h:mm - a";
        java.util.Date Agora = new java.util.Date();
        SimpleDateFormat Formatador = new SimpleDateFormat(Formato);
        return Formatador.format(Agora);
    }
    public String  getConexaoRepositorio(){return ConexaoRepositorio;}
    public String  getConexaoLocalhost(){return ConexaoLocalhost;}
    public String  getConexaoUsuario(){return ConexaoUsuario;}
    public String  getConexaoSenha(){return ConexaoSenha;}
    public String  getExecucaoComando(){return ExecucaoComando;}
    public String  getExecucaoParametroServidor(){return ExecucaoParametroServidor;}
    public String  getExecucaoParametroConta(){return ExecucaoParametroConta;}
    public String  getExecucaoParametroSenha(){return ExecucaoParametroSenha;}
    public String  getExecucaoParametroPersonagem(){return ExecucaoParametroPersonagem;}
    public boolean getExecucaoParametroSemopengl(){return ExecucaoParametroSemopengl;}
    public String  getDocumentacaoAlteracoes(){return DocumentacaoAlteracoes;}
    public String  getDocumentacaoComponentes(){return DocumentacaoComponentes;}
    public String  getDocumentacaoComentarios(){return DocumentacaoComentarios;}
    public String  getDocumentacaoTraducoes(){return DocumentacaoTraducoes;}

    public void setAtualizacaoEngineIntervalo(int Dias){ComportAtualizacaoEngineIntervalo=Dias;}
    public void setAtualizacaoEngineUltima(long Quando){ComportAtualizacaoEngineUltima=Quando;}
    public void setAtualizacaoEngineUltimaAgora(){ComportAtualizacaoEngineUltima=getAgora();}
    public void setAtualizacaoLocalhostIntervalo(int Dias){ComportAtualizacaoLocalhostIntervalo=Dias;}
    public void setAtualizacaoLocalhostUltima(long Quando){ComportAtualizacaoLocalhostUltima=Quando;}
    public void setAtualizacaoLocalhostUltimaAgora(){ComportAtualizacaoLocalhostUltima=getAgora();}

    public void setConexaoRepositorio(String URL){ConexaoRepositorio=URL ;}
    public void setConexaoLocalhost(String EnderecoDaPasta){ConexaoLocalhost=EnderecoDaPasta ;}
    public void setConexaoUsuario(String Usuario){ConexaoUsuario=Usuario ;}
    public void setConexaoSenha(String Senha){ConexaoSenha=Senha ;}
    public void setExecucaoComando(String Comando){ExecucaoComando=Comando ;}
    //public void setExecucaoParametroTMWData(String PastaTMWData){ExecucaoParametroTMWData=PastaTMWData ;}
    public void setExecucaoParametroServidor(String Servidor){ExecucaoParametroServidor=Servidor ;}
    public void setExecucaoParametroConta(String Conta){ExecucaoParametroConta=Conta ;}
    public void setExecucaoParametroSenha(String Senha){ExecucaoParametroSenha=Senha ;}
    public void setExecucaoParametroPersonagem(String Personagem){ExecucaoParametroPersonagem=Personagem ;}
    public void setExecucaoParametroSemopengl(boolean SemOpenGL){ExecucaoParametroSemopengl=SemOpenGL;}
    public void setDocumentacaoAlteracoes(String URLdeAlteracoes){DocumentacaoAlteracoes=URLdeAlteracoes ;}
    public void setDocumentacaoComponentes(String URLdeComponentes){DocumentacaoComponentes=URLdeComponentes ;}
    public void setDocumentacaoComentarios(String URLdeComentarios){DocumentacaoComentarios=URLdeComentarios ;}
    public void setDocumentacaoTraducoes(String URLdeTraducoes){DocumentacaoTraducoes=URLdeTraducoes ;}

    public void Esperar(int Milisegundos){
        long TempoInicio,TempoAtual;

        TempoInicio=System.currentTimeMillis();
        do{
            TempoAtual=System.currentTimeMillis();
        }
        while (TempoAtual-TempoInicio<Milisegundos);
    }
    public static void Mensagem_Erro(String Aviso, String Titulo) {
        System.out.println(Aviso);
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null,Aviso,Titulo,JOptionPane.WARNING_MESSAGE);
    }
    public static String UTF8toISO88591(String UTF8){
        try{
            return java.net.URLDecoder.decode(UTF8, "ISO-8859-1");
        } catch(UnsupportedEncodingException E){
            return UTF8;
        }
    }
    public static String ISO88591toUTF8(String ISO88591){
        try{
            String busca = new String(ISO88591.getBytes("UTF-8"), "ISO-8859-1");
            return busca;
        } catch(UnsupportedEncodingException E){
            return ISO88591;

        }/**/
    }
    public static boolean AbrirNavegador(String URL) {
        //minimizes the app

        String SistemaOperacional = System.getProperty("os.name").toLowerCase();
        Runtime Executador = Runtime.getRuntime();
        try {
            if (SistemaOperacional.indexOf("win") >= 0) {
                String[] cmd = new String[4];
                cmd[0] = "cmd.exe";
                cmd[1] = "/C";
                cmd[2] = "start";
                cmd[3] = URL;
                Executador.exec(cmd);
            } else if (SistemaOperacional.indexOf("mac") >= 0) {
                Executador.exec("open " + URL);
            } else {
                //prioritized 'guess' of users' preference
                String[] browsers = {"epiphany", "firefox", "mozilla", "konqueror", "netscape", "opera", "links", "lynx"};
                StringBuffer cmd = new StringBuffer();
                for (int i = 0; i < browsers.length; i++) {
                   cmd.append((i == 0 ? "" : " || ") + browsers[i] + " \"" +
                           URL + "\" ");
                }
                Executador.exec(new String[]{"sh", "-c", cmd.toString()});
                //rt.exec("firefox http://www.google.com");
                //System.out.println(cmd.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            ConfigClass.Mensagem_Erro(
                "\n\n O TMW-Maker n�o conseguiu abrir o seu navegador padr�o ao tentar acessar: \n\n " + URL + "\n\n",
                "Erro de acesso ao Navegado"
            );

            return false;
        }
        return true;
    }
    public boolean SeComandoProcede(String Comando) {
        String SistemaOperacional = System.getProperty("os.name").toLowerCase();
        Runtime Executador = Runtime.getRuntime();
        if (SistemaOperacional.indexOf("win") >= 0) {
            return false;
        } else if (SistemaOperacional.indexOf("mac") >= 0) {
            /*Executador.exec("open " + URL);/**/
            //Mensagem_Erro("Este comando ainda n�o foi implementado para o MAC!","Descupe!");
            return false;
        } else {
            try {
                Executador.exec(Comando);
                return true;
            } catch (IOException e) {
                return false;
            }
        }
    }
    public boolean SeComandoProcede() {
        return SeComandoProcede(getExecucaoComando()+" --help");
    }
    public boolean SeExiste(String PastaOuArquivo){
        File Capsula;
        Capsula = new File(PastaOuArquivo);
        if (Capsula.exists()){
            return true;
        }else{
            return false;
        }
    }
    public void Apagar(String PastaOuArquivo){
        File Objeto = new File(PastaOuArquivo);
        Objeto.delete();
    }
    public void CopiarArquivo(String De, String Para) {
        File CapsulaOrigem=new File(De);
        CopiarArquivo(CapsulaOrigem, Para);
    }
    public void CopiarArquivo(File CapsulaOrigem, String Para) {
        File CapsulaDestino=new File(Para);
        CapsulaDestino.setExecutable(CapsulaOrigem.canExecute(),true);
        CapsulaDestino.setReadable(CapsulaOrigem.canRead());
        CapsulaDestino.setWritable(CapsulaOrigem.canWrite());
        try {
            FileChannel Origem = new FileInputStream(CapsulaOrigem).getChannel();
            FileChannel Destino = new FileOutputStream(CapsulaDestino).getChannel();
            Origem.transferTo(0, Origem.size(),Destino);
            if (Origem != null && Origem.isOpen()) {
                Origem.close();
            }
            if (Destino != null && Destino.isOpen()) {
                Destino.close();
            }
        } catch(IOException Exc){
            //
        }/**/
    }
    public void MoverArquivo(String De, String Para) {
        File Origem = new File(De);
        File Destino = new File(Para);
        Origem.renameTo(Destino);
    }
    public void CriarPasta(String EnderecoDaNovaPasta){
        File dir = new File(EnderecoDaNovaPasta);
        dir.mkdirs();
    }
    public String[] ListarPastas(String Endereco){
        ///home/indigovox/localhost/eathena-data/npc
        File Capsula = new File(Endereco);
        File[] Conteudo = Capsula.listFiles();
        int ContPastas=0;
        for(int c=0; c<Conteudo.length; c++){
            if(Conteudo[c].isDirectory()){
                ContPastas++;
            }
        }
        String Pasta[] = new String[ContPastas];
        ContPastas=0;
        for(int p=0; p<Conteudo.length; p++){
            if(Conteudo[p].isDirectory()){
                Pasta[ContPastas]=Conteudo[p].getName();
                //TxtScript.setText(TxtScript.getText()+Conteudo[c].getName()+"\n");
                ContPastas++;
            }
        }
        Arrays.sort(Pasta);
        return Pasta;
    }
    public String[] ListarArquivos(String Endereco){
        ///home/indigovox/localhost/eathena-data/npc
        File Capsula = new File(Endereco);
        File[] Conteudo = Capsula.listFiles();
        int ContArquivos=0;
        for(int c=0; c<Conteudo.length; c++){
            if(Conteudo[c].isFile()){
                ContArquivos++;
            }
        }
        String Arquivos[] = new String[ContArquivos];
        ContArquivos=0;
        for(int a=0; a<Conteudo.length; a++){
            if(Conteudo[a].isFile()){
                Arquivos[ContArquivos]=Conteudo[a].getName();
                ContArquivos++;
            }
        }
        Arrays.sort(Arquivos);
        return Arquivos;
    }
    public boolean SeSimpleNomeDeArquivo(File PastaPai, String NomDeArquivo) {
        /**
         * Fun��o Copiada de Site "http://forums.sun.com/thread.jspa?threadID=629458"
         * Eu n�o entendo essa Fun��o, mas tentei implementa-la para ver se serve.
         */

        if (PastaPai == null || NomDeArquivo == null) return false;
        File Arquivo = new File(PastaPai, NomDeArquivo);
        if(!Arquivo.exists()){ //se o arquivo j� existe, pode ser o nome do arquivo est� correto
            try {
                boolean SeNomeValido = Arquivo.createNewFile();
                //Apagar o arquivo porque � criado para a verifica��o de valida��o
                if(SeNomeValido) Arquivo.delete();
                //Se o pai do novo arquivo e o pai dado � diferente, ent�o o nome do arquivo est� errado
                if(!Arquivo.getParent().equals(PastaPai.getPath())) return false;
                return SeNomeValido;
            } catch (IOException ioe) {
                return false;
            }
        }
        //Se o pai do novo arquivo e o pai dado � diferente, ent�o o nome do arquivo est� errado
        return Arquivo.getParent().equals(PastaPai.getPath());
    }
    public String getPropriedade(String Conteudo, String Propriedade) {
        int OndeEncontrado= Conteudo.indexOf("\n"+Propriedade+":",0);
        int FinalDeLinha= Conteudo.indexOf("\n",OndeEncontrado+Propriedade.length()+1);
        if(OndeEncontrado>=1){
            String Resultado=Conteudo.substring(OndeEncontrado+Propriedade.length()+3, FinalDeLinha).toString();
            //Mensagem_Erro("\""+Resultado+"\"","Aviso de Programador");
            return Resultado;
        }else{
            return "";
        }
    }

    public String  getEathenaData(){return ConexaoLocalhost+Barra+"eathena-data";}
    public String  getTMWData(){return ConexaoLocalhost+Barra+"tmwdata";}

    public void ConfiguracoesGravar(){ConfiguracoesGravar(ConfiguracaoURL);}
    public void ConfiguracoesGravar(String Endereco){
        String Corpo=
        "////////////////////////////////\n"+
        "// Configura��es do TMW-Maker //\n"+
        "////////////////////////////////\n"+
        "\n"+
        "Versao: "+getVersao()+"\n"+

        "ConexaoRepositorio: "+getConexaoRepositorio()+"\n"+
        "ConexaoLocalhost: "+getConexaoLocalhost()+"\n"+
        "ConexaoUsuario: "+getConexaoUsuario()+"\n"+
        "ConexaoSenha: "+getConexaoSenha()+"\n"+

        "ExecucaoComando: "+getExecucaoComando()+"\n"+
        //"ExecucaoParametroTMWData: "+getExecucaoParametroTMWData()+"\n"+
        "ExecucaoParametroServidor: "+getExecucaoParametroServidor()+"\n"+
        "ExecucaoParametroConta: "+getExecucaoParametroConta()+"\n"+
        "ExecucaoParametroSenha: "+getExecucaoParametroSenha()+"\n"+
        "ExecucaoParametroPersonagem: "+getExecucaoParametroPersonagem()+"\n"+
        "ExecucaoParametroSemopengl: "+(getExecucaoParametroSemopengl()?"true":"false")+"\n"+

        "DocumentacaoAlteracoes: "+getDocumentacaoAlteracoes()+"\n"+
        "DocumentacaoComponentes: "+getDocumentacaoComponentes()+"\n"+
        "DocumentacaoComentarios: "+getDocumentacaoComentarios()+"\n"+
        "DocumentacaoTraducoes: "+getDocumentacaoTraducoes()+"\n"+

        "AtualizacaoEngineUltima: "         +getAtualizacaoEngineUltima()+"\n"+
        "AtualizacaoEngineIntervalo: "      +getAtualizacaoEngineIntervalo()+"\n"+
        "AtualizacaoLocalhostUltima: "      +getAtualizacaoLocalhostUltima()+"\n"+
        "AtualizacaoLocalhostIntervalo: "   +getAtualizacaoLocalhostIntervalo()+"\n"+

        "\n//Fim de Configura��o";
        try {
            /*FileWriter out = new FileWriter(Endereco);
            out.write(Corpo);
            out.close();/**/
            BufferedWriter Capsula = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Endereco),"UTF-8"));
            Capsula.write(Corpo);
            Capsula.flush();
            Capsula.close();
        } catch (java.io.IOException exc) {
            Mensagem_Erro("N�o foi poss�vel salvar as configura��es!", "ERRO");
        }
    }
    public void ConfiguracoesAbrir(){ConfiguracoesAbrir(ConfiguracaoURL);}
    public void ConfiguracoesAbrir(String Endereco){
        //Rotina de Abrir Configurac�es
        String Conteudo="";
        try {
            /*FileReader CapsulaDeLer = new FileReader(Endereco);
            int Caracater = CapsulaDeLer.read();
            while (Caracater!=-1) {
                Conteudo = Conteudo + (char) Caracater;
                Caracater = CapsulaDeLer.read();
            }
            CapsulaDeLer.close();/**/
            String Linha="";
            FileInputStream stream = new FileInputStream(Endereco);
            InputStreamReader streamReader = new InputStreamReader(stream,"UTF-8");
            BufferedReader reader = new BufferedReader(streamReader);
            while ((Linha = reader.readLine()) != null) {
                if(!Conteudo.equals("")){
                    Conteudo=Conteudo+"\n"+Linha;
                }else{
                    Conteudo=Linha;
                }
            }
            reader.close();
            streamReader.close();
            stream.close();

            setConexaoRepositorio(getPropriedade(Conteudo,"ConexaoRepositorio"));
            setConexaoLocalhost(getPropriedade(Conteudo,"ConexaoLocalhost"));
            setConexaoUsuario(getPropriedade(Conteudo,"ConexaoUsuario"));
            setConexaoSenha(getPropriedade(Conteudo,"ConexaoSenha"));
            setExecucaoComando(getPropriedade(Conteudo,"ExecucaoComando"));
            //setExecucaoParametroTMWData(getPropriedade(Conteudo,"ExecucaoParametroTMWData"));
            setExecucaoParametroServidor(getPropriedade(Conteudo,"ExecucaoParametroServidor"));
            setExecucaoParametroConta(getPropriedade(Conteudo,"ExecucaoParametroConta"));
            setExecucaoParametroSenha(getPropriedade(Conteudo,"ExecucaoParametroSenha"));
            setExecucaoParametroPersonagem(getPropriedade(Conteudo,"ExecucaoParametroPersonagem"));
            setExecucaoParametroSemopengl(getPropriedade(Conteudo,"ExecucaoParametroSemopengl").equals("true"));
            setDocumentacaoAlteracoes(getPropriedade(Conteudo,"DocumentacaoAlteracoes"));
            setDocumentacaoComentarios(getPropriedade(Conteudo,"DocumentacaoComentarios"));
            setDocumentacaoComponentes(getPropriedade(Conteudo,"DocumentacaoComponentes"));
            setDocumentacaoTraducoes(getPropriedade(Conteudo,"DocumentacaoTraducoes"));

            setAtualizacaoEngineUltima(Long.parseLong(getPropriedade(Conteudo,"AtualizacaoEngineUltima").equals("")?"0":getPropriedade(Conteudo,"AtualizacaoEngineUltima")));
            setAtualizacaoEngineIntervalo(Integer.parseInt(getPropriedade(Conteudo,"AtualizacaoEngineIntervalo").equals("")?"1":getPropriedade(Conteudo,"AtualizacaoEngineIntervalo")));

            setAtualizacaoLocalhostUltima(Long.parseLong(getPropriedade(Conteudo,"AtualizacaoLocalhostUltima").equals("")?"0":getPropriedade(Conteudo,"AtualizacaoLocalhostUltima")));
            setAtualizacaoLocalhostIntervalo(Integer.parseInt(getPropriedade(Conteudo,"AtualizacaoLocalhostIntervalo").equals("")?"1":getPropriedade(Conteudo,"AtualizacaoLocalhostIntervalo")));

} catch (java.io.IOException exc) {
            //Mensagem_Erro("N�o foi possivel abrir o arquivo!","AVISO");
            //ExemploDeConteudo();
            //TxtScript.setEnabled(true);
            //CmbScript.setEnabled(true);
        }
    }

    public boolean getSeDependenciaDeConfiguracao() {
        if(SeExiste(ConfiguracaoURL)){
            return true;
        }else{
            return false;
        }
    }
    public boolean getSeDependenciaDeSVN(){
        return SeComandoProcede("svn --help");
    }
    public boolean getSeDependenciaDeLocalhost(){
        return SeExiste(getConexaoLocalhost());
    }
    public boolean getSeDependenciaDeGCC(){
        return SeComandoProcede("gcc --help");
    }
    public boolean getSeDependenciaDeMontagem(){
        if(
            SeExiste(
                getConexaoLocalhost().toString()+
                System.getProperty("file.separator")+"eathena-data"+
                System.getProperty("file.separator")+"char-server"
            )
            &&
            SeExiste(
                getConexaoLocalhost().toString()+
                System.getProperty("file.separator")+"eathena-data"+
                System.getProperty("file.separator")+"login-server"
            )
            &&
            SeExiste(
                getConexaoLocalhost().toString()+
                System.getProperty("file.separator")+"eathena-data"+
                System.getProperty("file.separator")+"map-server"
            )
            &&
            SeExiste(
                getConexaoLocalhost().toString()+
                System.getProperty("file.separator")+"eathena-data"+
                System.getProperty("file.separator")+"save"+
                System.getProperty("file.separator")+"account.txt"
            )
            &&
            SeExiste(
                ConexaoLocalhost+
                System.getProperty("file.separator")+"eathena-data"+
                System.getProperty("file.separator")+"conf"+
                System.getProperty("file.separator")+"gm_account.txt"
            )
        ){
            return true;
        }else{
            return false;
        }
    }
    public boolean getSeDependenciaDeManaplus(){
        return SeComandoProcede("manaplus --help");
    }
    public boolean getSeDependenciaDeTMW(){
        return SeComandoProcede("tmw --help");
    }
    public int getDependenciaEmFalta(){
        if(!getSeDependenciaDeConfiguracao()){
            return 1;
        }else if(!getSeDependenciaDeSVN()){
            return 2;
        }else if(!getSeDependenciaDeLocalhost()){
            return 3;
        }else if(!getSeDependenciaDeGCC()){
            return 4;
        }else if(!getSeDependenciaDeMontagem()){
            return 5;
        }else if(
            (getExecucaoComando().equals("manaplus") && !getSeDependenciaDeManaplus()) ||
            (getExecucaoComando().equals("tmw") && !getSeDependenciaDeTMW()) ||
            (!getExecucaoComando().equals("manaplus") && !getExecucaoComando().equals("tmw") && !SeComandoProcede(ExecucaoComando+" --help"))
        ){
            return 6;
        }else{
            return 0;
        }
    }

    public String getOS() {
        return System.getProperty("os.name").toLowerCase();
    }
    public String getArquiteturaOS() {
        return System.getProperty("os.arch").toLowerCase();
    }
    public String getVersaoOS() {
        return System.getProperty("os.version").toLowerCase();
    }

    public void Descompactar(String Arquivo, String EmPasta) {
        Enumeration entries;
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(Arquivo);
            entries = zipFile.entries();
            InputStream Entrada=null;
            OutputStream Saida=null;
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    System.err.println("Descompactando diret�rio: " + EmPasta+Barra+entry.getName());
                    (new File(EmPasta+Barra+entry.getName())).mkdir();
                    continue;
                }
                System.out.println("Descompactando arquivo:" + EmPasta+Barra+entry.getName());
                
                Entrada=zipFile.getInputStream(entry);
                Saida=new BufferedOutputStream(new FileOutputStream(EmPasta+Barra+entry.getName()));
                byte[] buffer = new byte[1024];
                int len;
                while ((len = Entrada.read(buffer)) >= 0) {
                    Saida.write(buffer, 0, len);
                }
                Entrada.close();
                Saida.close();
            }
            zipFile.close();
        } catch (IOException ioe) {
            System.err.println("Erro ao descompactar:" + ioe.getMessage());
            return;
        }
    }


}