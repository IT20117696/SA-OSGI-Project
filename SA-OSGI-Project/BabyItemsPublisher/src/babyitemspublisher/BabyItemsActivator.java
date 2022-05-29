package babyitemspublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BabyItemsActivator implements BundleActivator {

//	private static BundleContext context;
//
//	static BundleContext getContext() {
//		return context;
//	}
	
	ServiceRegistration publishServiceRegistration; 

	public void start(BundleContext context) throws Exception {
		//BabyItemsActivator.context = bundleContext;
		System.out.println("Baby Items Publisher Start");
		System.out.println(" ");
		
		BabyItemsPublish publisherService = new BabyItemsPublishImpl();
		publishServiceRegistration = context.registerService(BabyItemsPublish.class.getName(), publisherService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		//BabyItemsActivator.context = null;
		System.out.println("Baby Items Publisher stop");
		publishServiceRegistration.unregister();
	}

}
