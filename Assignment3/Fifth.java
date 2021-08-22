class AppCompatActivity {
    public void OnClickListener() {
        System.out.println("THis is the code on the main button below override the method and add you code");
    }

    public void OnClickListener(int i) {
        System.out.println(
                "Here is the example of function overriding and overloading as both the funciton names are same and any body can add his her code to this funciton ");
    }
}

public class Fifth {
    public static void main(String[] args) {
        AppCompatActivity activity = (AppCompatActivity) new AppCompatActivity() {
            @Override
            public void OnClickListener() {
                super.OnClickListener();
                System.out.println("this is my code and i'm overriding the method OnClickListener");
            }

            @Override
            public void OnClickListener(int i) {
                super.OnClickListener(i);
                System.out.println(
                        "here I can do anything with i and hence i'm adding my code to a alredy written code\n i*2="
                                + i * 2);
            }
        };
        activity.OnClickListener();
        activity.OnClickListener(2);
    }
}
