package commands;

import system.Session;
import data.keys.PersonKey;
import domain.model.Person;

/**
 * Accept a friend request from one user to another
 * 
 * @author merlin
 *
 */
public class CommandToAcceptFriendRequest implements Command {

    private int userIDOfRequestee;
    private String userNameOfRequester;

    /**
     * 
     * @param userIDOfRequestee
     *            the User ID of the user accepting the request
     * @param userNameOfRequester
     *            the User Name of the user who initiated the friend request
     */
    public CommandToAcceptFriendRequest(int userIDOfRequestee, String userNameOfRequester) {
        this.userIDOfRequestee = userIDOfRequestee;
        this.userNameOfRequester = userNameOfRequester;

    }

    /**
     * 
     * @see Command#execute()
     */
    @Override
    public void execute() {
        Person p = (Person)Session.getMapper(Person.class).find(new PersonKey(userIDOfRequestee));
        p.acceptFriendRequest(userNameOfRequester);
    }

    /**
     * Nothing needs to be retrieved from this command
     * 
     * @see Command#getResult()
     */
    @Override
    public Object getResult() {
        return null;
    }

}
