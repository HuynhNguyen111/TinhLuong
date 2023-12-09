import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		double heSoLuong;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ho ten");
		hoTen=sc.nextLine();
		System.out.println("nhap he so luong");
		heSoLuong=sc.nextDouble();
		System.out.println("ho ten: "+ hoTen+" Luong: "+heSoLuong*1800000);
	}

}
