package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
* QUESTION = ID + TEXTE + CATEGORIE + LISTE REPONSES + BONNE REP
*
 */
public class Question implements Serializable {

    private List lesPropositions = new ArrayList<Reponse>();
    private Reponse bonneReponse;
    private String laQuestion;
    private int idQuestion;
    private Categorie cat;

    public Question(String laQuestion, int idQuestion) {
        this.laQuestion = laQuestion;
        this.idQuestion = idQuestion;
    }

    public Question(String laQuestion) {
        this.laQuestion = laQuestion;
    }

    public List getLesPropositions() {
        return lesPropositions;
    }

    public void setLesPropositions(List lesPropositions) {
        this.lesPropositions = lesPropositions;
    }

    public Reponse getBonneReponse() {
        return bonneReponse;
    }

    public void setBonneReponse(Reponse bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

    public String getLaQuestion() {
        return laQuestion;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public void addProposition (Reponse rep){
        lesPropositions.add(rep);
    }

    @Override
    public String toString() {
        return "Question{" +
                "lesPropositions=" + lesPropositions +
                ", bonneReponse=" + bonneReponse +
                ", laQuestion='" + laQuestion + '\'' +
                ", idQuestion=" + idQuestion +
                ", cat=" + cat +
                '}';
    }
}
