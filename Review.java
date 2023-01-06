import javax.swing.JOptionPane;

public class Review {
    public void showPopUp() {

        String commentReview = "";

        // get JOptionPane button click input
        int buttonClicked = JOptionPane.showConfirmDialog(null, "Do you like the movie recommender we provide?",
                "Confirmation", JOptionPane.YES_NO_OPTION);

        if (buttonClicked == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for your cooperation !", "REVIEW",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (buttonClicked == JOptionPane.NO_OPTION) {
            commentReview = JOptionPane.showInputDialog("State why and what we need to improvise");
        } else {
            JOptionPane.showMessageDialog(null, "Have a nice day <3 ", "REVIEW", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Thank you for your review !", "REVIEW",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // TO DO: commentReview
    }

}