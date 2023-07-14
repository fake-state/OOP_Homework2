package First;
/**
 * Интерфейс для поиска информации.
 */
public interface I_Searchable {
    /**
     * Метод для поиска информации по ключевому слову.
     *
     * @param keyword ключевое слово для поиска
     */
    void search(String keyword);

    void searchByTitle(String title);
}