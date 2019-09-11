package threads;

class Resource {

    private String name;
    public synchronized void getAccess(String resource)
    {
        System.out.println(resource+" is accessed by "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread Exception Found!");
        }
        System.out.println(resource+" is released by "+Thread.currentThread().getName());
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ThreadRun extends Thread {

    Resource resource;

    ThreadRun(Resource obj)
    {
        resource = obj;
    }

    @Override
    public void run()
    {
        resource.setName("R");
        resource.getAccess(resource.getName());
    }
}

public class SynchronizedDemo {
    public static void main(String args[])
    {
        final Resource obj = new Resource();

        ThreadRun t1 = new ThreadRun(obj);
        ThreadRun t2 = new ThreadRun(obj);

        t1.start();
        t2.start();
    }
}
