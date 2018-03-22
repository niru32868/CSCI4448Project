
public class View {
	protected EventActivator = new Activator(); 
	protected pageUpdater = new Updater(); 
	public void EventActivate(int id) {
		EventActivator.activate(id); 
	}
	public void updatePage(int id, Object subject) {
		pageUpdater.update(id, subject); 
	}
}
