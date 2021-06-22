public class Application implements OnClickListener{
    private Menu menu1 = new Menu("menu1");
    private Menu menu2 = new Menu("menu2");
    private Button button1 = new Button("button1");

    private ScreenUI currentScreen = null;

    public Application(){
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        button1.setOnClickListener(this);
    }
    private OnClickListener menuListener = new OnClickListener(){
        public void clicked(Component eventSource){
            String sourceId = eventSource.getId();
            if(surceId.equals("menu1")){
                currentScreen = new Menu1ScreenUI();
            }
            else if(surceId.equals("menu2")){
                currentScreen = new Menu2ScreenUI();
            }
            else if (surceId.equals("menu3")){
                currentScreen = new Menu3ScreenUI();
            }
            currentScreen.show();
        }
    }
    private OnClickListener buttonListener= new OnClickListener(){
        public void clicked(Component eventSource){
            if(currentScreen == null)
                return ;
            String sourceId = eventSource.getId();
            if(sourceId.equals("button1"))
                currentScreen.handleButton1Click();
            else if (surceId.equals("button2"))
                currentScreen.handleButton2Click();
            
        }
    }
}

public interface ScreenUI{
    public void show();
    public void handleButton1Click();
    public void handleButton2Click();
}
public class Menu1ScreenUI implements ScreenUI{
    @Override
    public void show(){System.out.print("메뉴1 화면으로 전환");}

    @Override
    public void handleButton1Click() {
        System.out.println("메뉴1 화면의 버튼1 처리");
        
    }

    @Override
    public void handleButton2Click() {
        System.out.println("메뉴1 화면의 버튼2 처리");
        
    }
}
public class Menu2ScreenUI implements ScreenUI{

    @Override
    public void show() {
        System.out.println("메뉴2 화면으로 전환");
        
    }

    @Override
    public void handleButton1Click() {
        System.out.println("메뉴2화면의 버튼 1 처리");


    @Override
    public void handleButton2Click() {
        System.out.println("메뉴2 화면의 버튼2 처리");
    }
}
public class Menu3ScreenUI implements ScreenUI{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("메뉴3 화면으로 전환");
    }

    @Override
    public void handleButton1Click() {
        // TODO Auto-generated method stub
        System.out.println("메뉴3 화면의 버튼1 처리");
    }

    @Override
    public void handleButton2Click() {
        // TODO Auto-generated method stub
        System.out.println("메뉴3 화면의 버튼2 처리");
    }

}