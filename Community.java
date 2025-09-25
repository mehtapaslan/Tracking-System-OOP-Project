import java.util.*;
public class Community {
    private String name; // Name of the community
    private List<String> members; // List of community members
    private List<String> posts; // List of posts in the community

    // Constructor
    public Community(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.posts = new ArrayList<>();
    }
    public void addMember(String member) {
        if (member == null || member.isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be null or empty.");
        }
        if (!members.contains(member)) {
            members.add(member);
            System.out.println(member + " has joined the community " + name + ".");
        } else {
            System.out.println(member + " is already a member of the community.");
        }
    }
    public void removeMember(String member) {
        if (members.remove(member)) {
            System.out.println(member + " has left the community " + name + ".");
        } else {
            System.out.println(member + " is not a member of the community.");
        }
    }
    public void addPost(String postContent) {
        if (postContent == null || postContent.isEmpty()) {
            throw new IllegalArgumentException("Post content cannot be null or empty.");
        }
        posts.add(postContent);
        System.out.println("Post added to " + name + ": " + postContent);
    }
    public void displayMembers() {
        System.out.println("Community " + name + " Members: " + members);
    }
    public void displayPosts() {
        System.out.println("Community " + name + " Posts:");
        for (String post : posts) {
            System.out.println(post);
        }
    }
}