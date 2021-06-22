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
                currentScreen = new Menu2ScreenUI()''
            }
            currentScreen.show();
        }
    }
    private OnClickListener buttonListener= new OnClickListener)(){
        public void clicked(Component eventSource){
            if(currentScreen == null)
                return ;
            String sourceId = eventSource.getId();
            if(sourceId.equals("button1"))
                currentScreen.handleButton1Click();
            
        }
    }
    public void clicked(Component eventSource){
        String sourceId = eventSource.getId();
        if(sourceId.equels("menu1")){
            currentScreen = new Menu1ScreenUI();
            currentScreen.show();
        }else if (sourceId.equals("menu2")){
            currentScreen = new Menu2ScreenUI();
            currentScreen.show();
        }else if (sourceId.equals("button1")){
            if(currentScreen == null)
                return ; 
            currentScreen.handleButton1Click();
        }
    }
    private void changeUIToMenu1(){
        currentMenu = "menu1";
        System.out.println("메뉴1 화면으로 전환");
    }
    private void changeUIToMenu2(){
        currentMenu = "menu2";
        System.out.println("메뉴2 화면으로 전환");
    }
    private void processButton1WhenMenu1(){
        System.out.println("메뉴1 화면의 버튼1 처리");
    }
    private void processButton1WhenMenu2(){
        System.out.println("메뉴2화면의 버튼 1 처리");
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
    }

    @Override
    public void handleButton2Click() {
        System.out.println("메뉴2 화면의 버튼2 처리");
    }
}
