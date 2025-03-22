package LLD.SOLID.InterfaceSegregation;

/* better to seperate the interface from a general to different purpose interfaces
 *  - better visibility
 *  - bettter flexibility
 *  - better maintainability 
 */
public interface ISPInvalid {
    void emailNotification();

    void smsNotification();

    void whatsappNotification();
}
