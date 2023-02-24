/**
 * @author jiangxiulong
 * @version 1.0
 */
public class hello {
	public static void main(String[] args) {
		System.out.println("hello,word");
	}
}

class Dog {
	public static void main(String[] args) {
		System.out.println("dpg");
	}
}

class charSs {
	public static void main(String[] args) {
		System.out.println("北京\t天津\t上海");
		System.out.println("北京1\n天津1\n上海1");
		System.out.println("北京2\\\\天津2\\上海2");
		System.out.println("北京3\"天津3\'上海3");
		System.out.println("北京4\r天津4\r上海4");
		System.out.println("北京5\r\n天津5\r\n上海5");
		System.out.println("北京6\n天津6\n上海6");
	}
}

class char1 {
	public static void main(String[] arg) {
		System.out.println('a' + 10); // 97 + 10 相当于 char[a] + int(10)
		char c = 'a' + 10; // 107 相当于 char c = 107
		System.out.println(c); // k
		System.out.println((int) c);// 107
	}
}

// cp一行 shift+cm+d
// control + d 删除一行
class autoConvert {
	public static void main(String[] args) {
		// 在范围内是可以的具体赋值
		byte a = 10; // 对的
		int b = 1; // int
		//byte a = b; // 错误
	}
}