package jang7;


public class GenericMethodExample {
	// T가 타입 매개 변수인 제네릭 메소드
	public static<T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop();
			if (tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
		public static void main(String[] args) {
			// Double 타입의 GStack 생성
			GStack<Double> gs = new GStack<Double>();

			// 5개의 요소를 스택에 push
			for (int i = 0; i < 5; i++) {
				gs.push(new Double(i));
			}
			gs = reverse(gs);
			for (int i = 0; i < 5; i++) {
				System.out.println(gs.pop());
			}

		}
	}


