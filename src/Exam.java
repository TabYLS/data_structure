import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		if(T > 100) {
			System.out.println("T大于100");
			return;
		}
		int r = 0, g = 0, b = 0;
		Integer[] params1 = new Integer[3];
		Integer[] params2 = new Integer[2];
		Integer[] result = new Integer[T];
		for(int i = 0; i < T; i ++) {
			String rgb = br.readLine();
			String[] colors = rgb.split(" ");
			r = Integer.valueOf(colors[0]);
			g = Integer.valueOf(colors[1]);
			b = Integer.valueOf(colors[2]);
			if(r < 0 && r > 2*Math.pow(10, 9)) {
				System.out.println("r超过范围");
				return;
			}
			if(g < 0 && g > 2*Math.pow(10, 9)) {
				System.out.println("g超过范围");
				return;
			}
			if(b < 0 && b > 2*Math.pow(10, 9)) {
				System.out.println("b超过范围");
				return;
			}
			params1[0] = r;
			params1[1] = g;
			params1[2] = b;
			
			
			int min = getMin(params1);
			for(int j = 0; j < params1.length; j++){
				if(min == params1[j]) {
					
				} else {
					if(j >= 2)
						j = 0;
					params2[j] = params1[j];
				}
			}
			int mid = getMin(params2);
			int max = (mid == params2[0])?params2[1]:params2[0];
			if((max / 2) >= mid) {
				result[i] = min + mid;
			} else {
				result[i] = min + (max / 2);
			}
		}
		for(Integer a : result){
			System.out.println(a);
		}
	}
	
	public static int getMin(Integer[] params) {
		int min = params[0];
		for(int j = 0; j < params.length; j ++) {
			min = params[j];
		}
		return min;
	}

}
