package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Группа П50-6-19, П50-11/6-20", "Неделя: Числитель/\nЗнаменатель\n"),
                new MyMovieData("Понедельник","Пара               Предмет                  Преподаватель\n" +
                        "1. Разработка программных модулей/ А.Ю. Бушин\n" +
                        "   Технология разработки и защиты баз данных А.С. Токарчук\n" +
                        "2.\tФизическая культура\t Д.М. Салоникес\n" +
                        "3.\tИнструментальные средства разработки ПО\t Ю.В. Севастьянов\n" +
                        "4.\tРазработка программных модулей\t А.А. Шимбирёв\n"),
                new MyMovieData("Вторник","Пара               Предмет                  Преподаватель\n" +
                        "1.\t         ПРАКТИКА\t\n" +
                        "2.\t         ПРАКТИКА\n" +
                        "3.\t         ПРАКТИКА\t\n" +
                        "4.\t         ПРАКТИКА\t\n" +
                        "5.\t         ПРАКТИКА\t\n" +
                        "6.\t         ПРАКТИКА\n"),
                new MyMovieData("Среда","Пара               Предмет                  Преподаватель\n" +
                        "1. \t        ПРАКТИКА\t\n" +
                        "2. \t        ПРАКТИКА\n" +
                        "3. \t        ПРАКТИКА\t\n" +
                        "4. \t        ПРАКТИКА\t\n" +
                        "5. \t        ПРАКТИКА\t\n" +
                        "6. \t        ПРАКТИКА\n"),
                new MyMovieData("Четверг","Пара               Предмет                  Преподаватель\n" +
                        "1. \tТехнология разработки программного обеспечения\t Л.А. Соколова\n" +
                        "2. \tРазработка программных модулей\t А.Ю. Бушин\n" +
                        "3. \tСистемное программирование\t А.Д. Нилов\n" +
                        "4. \tРазработка мобильных приложений\t А.О. Лясников\n"),
                new MyMovieData("Пятница","Пара               Предмет                  Преподаватель\n" +
                        "2. \tИностранный язык в профессиональной деятельности\t А.Д. Завьялова, А.Ю. Дымская\n" +
                        "3. \tТехнология разработки и защиты баз данных\t А.С. Токарчук\n" +
                        "4. \tИнструментальные средства разработки ПО/ Ю.В. Севастьянов\n" +
                        "     Разработка мобильных приложений А.О. Лясников\n" +
                        "5. \tТехнология разработки программного обеспечения/ Л.А. Соколова\n" +
                        "     Системное программирование А.Д. Нилов\n"),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}
