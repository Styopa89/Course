package lesson9.observerJurnal;


public interface Publisher {

    void addSubscriberr(Subscriber o);
    void removeSubscriber(Subscriber o);
    void notifySubscriber();

}
