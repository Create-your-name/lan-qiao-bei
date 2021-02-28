package _2_25;

public class _7_t6 {
	static int [][] a=new int[3][4];
	public static void main(String[] args)
	{
		int sum=0;
		a[0][0]=-1;
		a[2][3]=-1;
		for(int i=1;i<=9;i++) {
			a[0][1]=i;
				for(int b=1;b<=9;b++) {
					a[0][2]=b;
					if(forjudge(0,2)) {	
					}else{
						continue;
					}
					for(int c=1;c<=9;c++) {
						a[0][3]=c;
						if(forjudge(0,3)) {
					}else{
							continue;
						}
						for(int d=1;d<=9;d++) {
							a[1][0]=d;
							if(forjudge(1,0)) {
							}else{
								continue;
							}
							for(int e=1;e<=9;e++) {
								a[1][1]=e;
								if(forjudge(1,1)) {
								}else{
									continue;
								}
								for(int f=1;f<=9;f++) {
									a[1][2]=f;
									if(forjudge(1,2)) {
									}else{
										continue;
									}
									for(int g=1;g<=9;g++) {
										a[1][3]=g;
										if(forjudge(1,3)) {
										}else{
											continue;
										}
										for(int h=1;h<=9;h++) {
											a[2][0]=h;
											if(forjudge(2,0)) {
											}else{
												continue;
											}
											for(int j=1;j<=9;j++) {
												a[2][1]=j;
												if(forjudge(2,1)) {
												}else{
													continue;
												}
												for(int k=1;k<=9;k++) {
													a[2][2]=k;
													if(forjudge(2,2)) {
													}else{
														continue;
													}		
													sum++;
											}
										}
									}
										
								}
							}
						}
					}
				}
			}
		}
		System.out.print(sum);
	}
	public static boolean forjudge(int o,int b) {// o为数组第一   b为第二
		if(o==0&&b!=3) {
			for(int c=b-1;c>=1;c--) {
				if(a[0][c]==a[0][b]||a[0][b]==a[0][b-1]+1||a[0][b]==a[0][b-1]-1||a[0][b]==a[0][b+1]+1||a[0][b]==a[0][b+1]-1) {
					return false;
				}
			}
		}else {
			
				for(int c=b-1;c>=1;c--) {
					if(a[0][c]==a[0][b]||a[0][b]==a[0][b-1]+1||a[0][b]==a[0][b-1]-1) {
						return false;
					}
			}
		}
			if(o==1&&b!=3&&b!=0) {
				for(int c=b-1;c>=0;c--) {
					if(a[o][c]==a[o][b]||a[o-1][c]==a[o][b]||a[o-1][b]==a[o][b]||a[o][b]==a[o][b-1]+1||a[o][b]==a[o][b-1]-1||a[o][b]==a[o][b+1]+1||a[o][b]==a[o][b+1]-1) {
						return false;
						}
					}
			}else {
				if(b==0) {
					for(int c=b-1;c>=0;c--) {
						if(a[o][c]==a[o][b]||a[o-1][c]==a[o][b]||a[o-1][b]==a[o][b]) {
							return false;
							}
						}
					}else {
					for(int c=b-1;c>=0;c--) {
						if(a[o][c]==a[o][b]||a[o-1][c]==a[o][b]||a[o-1][b]==a[o][b]||a[o][b]==a[o][b-1]+1||a[o][b]==a[o][b-1]-1) {
							return false;
							}
						}
					}
				}
			if(o==2&&b!=3) {
				for(int c=b-1;c>=0;c--) {
					if(a[o][c]==a[o][b]||a[o-1][c]==a[o][b]||a[o-2][c]==a[o][b]||a[o-1][b]==a[o][b]||a[o-2][b]==a[o][b]||a[o-1][b]==a[o][b]||a[o][b]==a[o][b-1]+1||a[o][b]==a[o][b-1]-1||a[o][b]==a[o][b+1]+1||a[o][b]==a[o][b+1]-1) {
						return false;
						}
					}
			}else {
				
					for(int c=b-1;c>=0;c--) {
						if(a[o][c]==a[o][b]||a[o-1][c]==a[o][b]||a[o-2][c]==a[o][b]||a[o-1][b]==a[o][b]||a[o-2][b]==a[o][b]||a[o-1][b]==a[o][b]||a[o][b]==a[o][b-1]+1||a[o][b]==a[o][b-1]-1) {
							return false;
							}
						}
				}
			
		
		return true;		
	}
}
