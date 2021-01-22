package Clases;

import java.io.*;
import java.io.File;

public class ATexto {

    BufferedWriter bw = null;
    FileWriter fw = null;
    BufferedReader br = null;
    File file = null;

    public void Escribir(String data, String nombre, String genero, String descripcion, double precio, int rating, int stock) {
        try {

            file = new File("" + nombre);

            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            String p = ("" + precio);
            String r = ("" + rating);
            String s = ("" + stock);

            bw.write(data);
            bw.newLine();
            bw.write(genero);
            bw.newLine();
            bw.write(descripcion);
            bw.newLine();
            bw.write(p);
            bw.newLine();
            bw.write(r);
            bw.newLine();
            bw.write(s);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void Escribir2(String nombre, String archivo, int id, int peli, String fecha) {
        try {

            file = new File("" + archivo);

            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            String i = ("" + id);
            String p = ("" + peli);

            bw.write(nombre);
            bw.newLine();
            bw.write(i);
            bw.newLine();
            bw.write(p);
            bw.newLine();
            bw.write(fecha);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void Borrar(String file, String lineToRemove) {

        try {

            File inFile = new File(file);

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while ((line = br.readLine()) != null) {

                if (!line.trim().equals(lineToRemove)) {

                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(inFile)) {
                System.out.println("Could not rename file");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*
    public void Mostrar(String archivo) throws FileNotFoundException, IOException {

        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int num = 1;
        while ((cadena = b.readLine()) != null) {

            if (num == 1) {
                A = cadena;
                num++;
            } else {
                if (num == 2) {
                    B = cadena;
                    num++;
                } else {
                    if (num == 3) {
                        C = cadena;
                        num++;
                    } else {
                        if (num == 4) {
                            D = cadena;
                            num++;
                        } else {
                            if (num == 5) {
                                E = cadena;
                                num++;
                            } else {
                                if (num == 6) {
                                    F = cadena;
                                    num = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        b.close();
    }

    
    public void Mostrar2(String archivo) throws FileNotFoundException, IOException {

        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int num = 1;
        while ((cadena = b.readLine()) != null) {

            if (num == 1) {
                G = cadena;
                num++;
            } else {
                if (num == 2) {
                    H = cadena;
                    num++;
                } else {
                    if (num == 3) {
                        I = cadena;
                        num++;
                    } else {
                        if (num == 4) {
                            J = cadena;
                            num = 1;
                        }
                    }
                }
            }
        }
        b.close();
    }

    public static void Copiar(String origen, String copia) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(origen);
            os = new FileOutputStream(copia);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    */
    public boolean EstaVacio(String file) {

        try {
            File inFile = new File(file);
            BufferedReader br = new BufferedReader(new FileReader(inFile));

            String line = null;
            line = br.readLine();

            if (line == null) {
                br.close();
                return true;
            }
            br.close();
        } catch (Exception e) {
        }

        return false;

    }

}
