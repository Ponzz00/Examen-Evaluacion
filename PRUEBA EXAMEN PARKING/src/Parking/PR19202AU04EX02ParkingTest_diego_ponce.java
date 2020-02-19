package Parking;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;
	
	public class PR19202AU04EX02ParkingTest_diego_ponce {
		public static void main(String[] args) {
				// Realizamos las instancias de las clases a utilizar
			PR19202AU04EX02Parking_diego_ponce parking=new PR19202AU04EX02Parking_diego_ponce(3, 2);
				Scanner sc=new Scanner(System.in);
				String matricula;
				int opcion;
				

				do {
					System.out.println("\n[Pulsa 0 para volvera al menu]");
				System.out.println("\n -----------MENU-------------\n"
						+ "  \n1=Leer matricula de un fichero "
						+ "  \n2=Entrar Coche"
						+ "  \n3=Entra Coche Discapacitado "
						+ "  \n4=Salir Coche"
						+ "	 \n5=Salir Coche Discapacitado "
						+ "  \n6=Guardar lista de matriculas "
						+ "  \n7=Salir del menu");
					opcion=sc.nextInt();	
						switch (opcion) {
						case 1:
							try {
								parking.llegirMatricules(args[0]);
							} catch (Exception e) {
								e.printStackTrace();
							}
							break;
						case 2:
							try {
								System.out.println(parking.entraCotxe("AAA"));
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							break;
						case 3:
							try {
								System.out.println(parking.entraCotxeDiscapacitat("AAA"));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 4:
							try {
								parking.surtCotxe("AAA");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 5:
							try {
								parking.surtCotxeDiscapacitats("AAA");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 6:
							
							break;
						case 7:
							System.out.println("Saliendo del menu");
							break;
						default:
							System.out.println("Opcion del menu introducida, erronea");
							break;			
						}
						// Pide otra vez la opcion del menu
						opcion=sc.nextInt();
					} while(opcion!=7);
					
				
		}
	}



