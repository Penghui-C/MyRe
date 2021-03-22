import java.util.*;

class Riqi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("根据日期查看对应的天数");
		
		//成员变量
		int mon = 0;
		int year = 0;
		int day = 0;
		int num = 0;
		
		System.out.println("请输入年：");
		year = sc.nextInt();
		//定义二月的初始天数
		int two = 28;
		
		if(0 == year % 4 && 100 != year % 4) {
			two = 29;
		}
		System.out.println("请输入月：");
		boolean sou = true;
		while (sou) {
			mon = sc.nextInt();
			if(mon > 0 && mon <= 12 && 0 == mon % 1) {
				sou = false;
			}
		}
		System.out.println("请输入日：");
		sou = true;
		while (sou) {
			day = sc.nextInt();
			if(mon > 0 && day <= 31 && 0 == day % 1) {
				if(mon <= 7) {
					if(0 == mon % 2 && day <= 30) {
						if(mon == 2 && day <= two) {
							sou = false;
						} else {
							sou = false;
						}
						num = (mon / 2 + 1) * 61 - 30 + day;
					} else {
						sou = false;
						num = (mon / 2) * 61 + day;
					}
				} else {
					if(1 == mon % 2 && day <= 30) {
							sou = false;
							num = 184 + two + ((mon - 7) / 2) * 61 + day;
					} else {
						sou = false;
						num = 184 + two + ((mon - 7) / 2) * 61 + day;
					}
				}
			}
		}
		
		System.out.println("这是" + year + "年的第：" + num + "天！");
	
		
		//xiugai
		
	}
}