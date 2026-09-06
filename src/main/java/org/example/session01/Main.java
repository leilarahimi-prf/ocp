package org.example.session01;

// فقط همین یک کلاس public است و نامش با فایل یکی است
public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        System.out.println(helper.add(2, 3));
    }
}

// این کلاس public نیست (default است) و فقط در همین پکیج قابل استفاده است
class Helper {
    public int add(int a, int b) {
        return a + b;
    }
}

// حتی می‌توانید کلاس سوم هم اضافه کنید (باز هم غیر public)
class Logger {
    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}
