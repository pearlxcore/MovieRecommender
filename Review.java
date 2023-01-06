import javax.swing.JOptionPane;
public class Review {
    public void showPopUp() {

        String commentReview = "";
        int buttonClicked = JOptionPane.showConfirmDialog(null, "Do you like the movie recommender we provide?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        if (buttonClicked == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(null, "Thank you for your cooperation !", "REVIEW",
                    JOptionPane.OK_OPTION);
        } else if (buttonClicked == JOptionPane.NO_OPTION) {
            commentReview = JOptionPane.showInputDialog("State why and what we need to improvise");
        } else {
            JOptionPane.showConfirmDialog(null, "Have a nice day <3 ", "REVIEW", JOptionPane.DEFAULT_OPTION);
            JOptionPane.showConfirmDialog(null, "Thank you for your review !", "REVIEW", JOptionPane.DEFAULT_OPTION);
        }

        // TO DO: commentReview
    }

}