import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StepDefinations {

Cake cake;
    @Given("^I have (\\d+) cakes in my belly$")
    public void i_have_cakes_in_my_belly(int n)  {
        cake = new Cake(n);
    }

    @When("^I eat (\\d+) cakes$")
    public void i_eat_cakes(int m) {
        cake.comsumeCake(m);
    }

    @Then("^I should left with (\\d+) cakes$")
    public void i_should_left_with_cakes(int n) throws Exception {
        Assert.assertEquals(n,cake.getNumberOfCakes());
    }

    ///
    private BookStore store;
    private List<Book> foundBooks;

    @Before
    public void setUp() {
        store = new BookStore();
        foundBooks = new ArrayList<>();
    }

    @Given("^I have the following books in the store by map$")
    public void i_have_the_following_books_in_the_store_by_map(DataTable table) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            store.addBook(new Book(columns.get("title"), columns.get("author")));
        }
    }

    @When("^I search for books by author Erik Larson$")
    public void i_search_for_books_by_author_Erik_Larson()  {
        foundBooks = store.booksByAuthor("Erik Larson");
    }

    @Then("^I find (\\d+) books$")
    public void i_find_books(int arg1)  {
        Assert.assertEquals(foundBooks.size(),arg1);
    }

}
