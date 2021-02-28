package _2_26;

public class _6_t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xiang;
		int rei;
		int sheng;
		int huei;
		int san;
		int yang;
		int xian;
		int qi;
		for(xiang=1;xiang<=9;xiang++) {
			for(rei=0;rei<=9;rei++) {
				if(xiang==rei) {
					continue;
				}
				for(sheng=0;sheng<=9;sheng++) {
					if(xiang==sheng||sheng==rei) {
						continue;
					}
					for(huei=0;huei<=9;huei++) {
						if(xiang==huei||huei==rei||huei==sheng) {
							continue;
						}
						for(san=1;san<=9;san++) {
							if(xiang==san||san==rei||san==sheng||san==huei) {
								continue;
							}
							for(yang=0;yang<=9;yang++) {
								if(xiang==yang||yang==rei||yang==sheng||yang==huei||yang==san) {
									continue;
								}
								for(xian=0;xian<=9;xian++) {
									if(xiang==xian||xian==rei||xian==sheng||xian==huei||xian==san||xian==yang) {
										continue;
									}
									for(qi=0;qi<=9;qi++) {
										if(xiang==qi||qi==rei||qi==sheng||qi==huei||qi==san||qi==yang||qi==xian) {
											continue;
										}
										if( 
												xiang*1000+rei*100+sheng*10+huei+san*1000+yang*100+xian*10+rei==san*10000+yang*1000+sheng*100+rei*10+qi&&xiang!=0&&san!=0
												) {

											System.out.println(san);
											System.out.println(yang);
											System.out.println(xian);
											System.out.println(rei);
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

}
