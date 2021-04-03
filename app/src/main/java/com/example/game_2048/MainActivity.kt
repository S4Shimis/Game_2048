package com.example.game_2048

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var lose_check = 0;
    var win_check = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val play_Button = findViewById<Button>(R.id.button)

        play_Button.isClickable = false

        val down_Button = findViewById<Button>(R.id.button5)
        val left_Button = findViewById<Button>(R.id.button3)
        val right_Button = findViewById<Button>(R.id.button4)
        val up_Button = findViewById<Button>(R.id.button2)

        up_Button.isClickable = false
        left_Button.isClickable = false
        right_Button.isClickable = false
        down_Button.isClickable = false

        val TV_interract = findViewById<TextView>(R.id.textView3)

        TV_interract.text = "Enjoy the game!"

        val TV_00 = findViewById<TextView>(R.id.textView)
        val TV_01 = findViewById<TextView>(R.id.textView4)
        val TV_02 = findViewById<TextView>(R.id.textView5)
        val TV_03 = findViewById<TextView>(R.id.textView6)
        val TV_10 = findViewById<TextView>(R.id.textView7)
        val TV_11 = findViewById<TextView>(R.id.textView8)
        val TV_12 = findViewById<TextView>(R.id.textView9)
        val TV_13 = findViewById<TextView>(R.id.textView10)
        val TV_20 = findViewById<TextView>(R.id.textView11)
        val TV_21 = findViewById<TextView>(R.id.textView12)
        val TV_22 = findViewById<TextView>(R.id.textView13)
        val TV_23 = findViewById<TextView>(R.id.textView14)
        val TV_30 = findViewById<TextView>(R.id.textView15)
        val TV_31 = findViewById<TextView>(R.id.textView16)
        val TV_32 = findViewById<TextView>(R.id.textView17)
        val TV_33 = findViewById<TextView>(R.id.textView18)

        TV_00.text = "0"
        TV_01.text = "0"
        TV_02.text = "0"
        TV_03.text = "0"
        TV_10.text = "0"
        TV_11.text = "0"
        TV_12.text = "0"
        TV_13.text = "0"
        TV_20.text = "0"
        TV_21.text = "0"
        TV_22.text = "0"
        TV_23.text = "0"
        TV_30.text = "0"
        TV_31.text = "0"
        TV_32.text = "0"
        TV_33.text = "0"

        val main_arrayTV = arrayOf(
                arrayOf(TV_00, TV_01, TV_02, TV_03),
                arrayOf(TV_10, TV_11, TV_12, TV_13),
                arrayOf(TV_20, TV_21, TV_22, TV_23),
                arrayOf(TV_30, TV_31, TV_32, TV_33)
        )


        val main_array = arrayOf(
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0)
        )



        fun sort_up () {
            //var a = 0
            for (i in 1..3) {
                for (j in 0..2) {

                    if ((main_array[j][0] == 0) && (main_array[j+1][0] != 0)) {
                        main_array[j][0] = main_array[j+1][0]
                        main_array[j+1][0] = 0
                    }

                    if ((main_array[j][1] == 0) && (main_array[j+1][1] != 0)) {
                        main_array[j][1] = main_array[j+1][1]
                        main_array[j+1][1] = 0
                    }

                    if ((main_array[j][2] == 0) && (main_array[j+1][2] != 0)) {
                        main_array[j][2] = main_array[j+1][2]
                        main_array[j+1][2] = 0
                    }

                    if ((main_array[j][3] == 0) && (main_array[j+1][3] != 0)) {
                        main_array[j][3] = main_array[j+1][3]
                        main_array[j+1][3] = 0
                    }

                }
            }

        }

        fun sort_left () {

            for (i in 1..3) {
                for (j in 0..2) {

                    if ((main_array[0][j] == 0) && (main_array[0][j+1] != 0)) {
                        main_array[0][j] = main_array[0][j+1]
                        main_array[0][j+1] = 0
                    }

                    if ((main_array[1][j] == 0) && (main_array[1][j+1] != 0)) {
                        main_array[1][j] = main_array[1][j+1]
                        main_array[1][j+1] = 0

                    }
                    if ((main_array[2][j] == 0) && (main_array[2][j+1] != 0)) {
                        main_array[2][j] = main_array[2][j+1]
                        main_array[2][j+1] = 0
                    }

                    if ((main_array[3][j] == 0) && (main_array[3][j+1] != 0)) {
                        main_array[3][j] = main_array[3][j+1]
                        main_array[3][j+1] = 0
                    }

                }
            }

        }

        fun sort_right () {

            for (i in 1..3) {
                for (j in 3 downTo 1) {

                    if ((main_array[0][j] == 0) && (main_array[0][j-1] != 0)) {
                        main_array[0][j] = main_array[0][j-1]
                        main_array[0][j-1] = 0
                    }

                    if ((main_array[1][j] == 0) && (main_array[1][j-1] != 0)) {
                        main_array[1][j] = main_array[1][j-1]
                        main_array[1][j-1] = 0

                    }
                    if ((main_array[2][j] == 0) && (main_array[2][j-1] != 0)) {
                        main_array[2][j] = main_array[2][j-1]
                        main_array[2][j-1] = 0
                    }

                    if ((main_array[3][j] == 0) && (main_array[3][j-1] != 0)) {
                        main_array[3][j] = main_array[3][j-1]
                        main_array[3][j-1] = 0
                    }

                }
            }

        }

        fun sort_down () {

            for (i in 1..3) {
                for (j in 3 downTo 1) {

                    if ((main_array[j][0] == 0) && (main_array[j-1][0] != 0)) {
                        main_array[j][0] = main_array[j-1][0]
                        main_array[j-1][0] = 0
                    }

                    if ((main_array[j][1] == 0) && (main_array[j-1][1] != 0)) {
                        main_array[j][1] = main_array[j-1][1]
                        main_array[j-1][1] = 0
                    }

                    if ((main_array[j][2] == 0) && (main_array[j-1][2] != 0)) {
                        main_array[j][2] = main_array[j-1][2]
                        main_array[j-1][2] = 0
                    }

                    if ((main_array[j][3] == 0) && (main_array[j-1][3] != 0)) {
                        main_array[j][3] = main_array[j-1][3]
                        main_array[j-1][3] = 0
                    }

                }
            }

        }

        fun display () {
            for (i in 0..3) {
                for (j in 0..3) {
                    main_arrayTV[i][j].text = main_array[i][j].toString()
                }
            }
        }

        fun add_number() {

            var tmp = 0
            var row = 0
            var column = 0
            var randomNumber = 0
            var look_for_free_places = 0

            for (i in 0..3) {
                for (j in 0..3) {
                    if (main_array[i][j] == 0) {
                        look_for_free_places++
                    }
                }
            }

            lose_check++

            if (look_for_free_places == 0) {
                lose_check = 16
            }
            else {
                while(tmp != 1) {

                    row = Random.nextInt(0, 4)
                    column = Random.nextInt(0, 4)

                    if (main_array[row][column] == 0) {

                        randomNumber = Random.nextInt(0, 10) // 10% for 4 and 90% for 2
                        if (randomNumber == 0) {
                            main_array[row][column] = 4
                        } else {
                            main_array[row][column] = 2
                        }

                        tmp = 1
                    }
                }
            }



        }

        fun vert_algorithm() {

            sort_up()

            if ((main_array[0][0] == main_array[1][0]) && (main_array[0][0] != 0)) {
                main_array[0][0] = main_array[0][0] + main_array[1][0]
                main_array[1][0] = 0
                lose_check--
            }

            if ((main_array[1][0] == main_array[2][0]) && (main_array[1][0] != 0)) {
                main_array[1][0] = main_array[1][0] + main_array[2][0]
                main_array[2][0] = 0
                lose_check--
            }

            if ((main_array[2][0] == main_array[3][0]) && (main_array[3][0] != 0)) {
                main_array[2][0] = main_array[2][0] + main_array[3][0]
                main_array[3][0] = 0
                lose_check--
            }

            //

            if ((main_array[0][1] == main_array[1][1]) && (main_array[0][1] != 0)) {
                main_array[0][1] = main_array[0][1] + main_array[1][1]
                main_array[1][1] = 0
                lose_check--
            }

            if ((main_array[1][1] == main_array[2][1]) && (main_array[1][1] != 0)) {
                main_array[1][1] = main_array[1][1] + main_array[2][1]
                main_array[2][1] = 0
                lose_check--
            }

            if ((main_array[2][1] == main_array[3][1]) && (main_array[3][1] != 0)) {
                main_array[2][1] = main_array[2][1] + main_array[3][1]
                main_array[3][1] = 0
                lose_check--
            }

            //

            if ((main_array[0][2] == main_array[1][2]) && (main_array[0][2] != 0)) {
                main_array[0][2] = main_array[0][2] + main_array[1][2]
                main_array[1][2] = 0
                lose_check--
            }

            if ((main_array[1][2] == main_array[2][2]) && (main_array[1][2] != 0)) {
                main_array[1][2] = main_array[1][2] + main_array[2][2]
                main_array[2][2] = 0
                lose_check--
            }

            if ((main_array[2][2] == main_array[3][2]) && (main_array[3][2] != 0)) {
                main_array[2][2] = main_array[2][2] + main_array[3][2]
                main_array[3][2] = 0
                lose_check--
            }

            //

            if ((main_array[0][3] == main_array[1][3]) && (main_array[0][3] != 0)) {
                main_array[0][3] = main_array[0][3] + main_array[1][3]
                main_array[1][3] = 0
                lose_check--
            }

            if ((main_array[1][3] == main_array[2][3]) && (main_array[1][3] != 0)) {
                main_array[1][3] = main_array[1][3] + main_array[2][3]
                main_array[2][3] = 0
                lose_check--
            }

            if ((main_array[2][3] == main_array[3][3]) && (main_array[3][3] != 0)) {
                main_array[2][3] = main_array[2][3] + main_array[3][3]
                main_array[3][3] = 0
                lose_check--
            }

        }



        fun hor_algorithm() {

            sort_left()

            if ((main_array[0][0] == main_array[0][1]) && (main_array[0][0] != 0)) {
                main_array[0][0] = main_array[0][0] + main_array[0][1]
                main_array[0][1] = 0
                lose_check--
            }

            if ((main_array[0][1] == main_array[0][2]) && (main_array[0][1] != 0)) {
                main_array[0][1] = main_array[0][1] + main_array[0][2]
                main_array[0][2] = 0
                lose_check--
            }

            if ((main_array[0][2] == main_array[0][3]) && (main_array[0][2] != 0)) {
                main_array[0][2] = main_array[0][2] + main_array[0][3]
                main_array[0][3] = 0
                lose_check--
            }

            //

            if ((main_array[1][0] == main_array[1][1]) && (main_array[1][0] != 0)) {
                main_array[1][0] = main_array[1][0] + main_array[1][1]
                main_array[1][1] = 0
                lose_check--
            }

            if ((main_array[1][1] == main_array[1][2]) && (main_array[1][1] != 0)) {
                main_array[1][1] = main_array[1][1] + main_array[1][2]
                main_array[1][2] = 0
                lose_check--
            }

            if ((main_array[1][2] == main_array[1][3]) && (main_array[1][2] != 0)) {
                main_array[1][2] = main_array[1][2] + main_array[1][3]
                main_array[1][3] = 0
                lose_check--
            }

            //

            if ((main_array[2][0] == main_array[2][1]) && (main_array[2][0] != 0)) {
                main_array[2][0] = main_array[2][0] + main_array[2][1]
                main_array[2][1] = 0
                lose_check--
            }

            if ((main_array[2][1] == main_array[2][2]) && (main_array[2][1] != 0)) {
                main_array[2][1] = main_array[2][1] + main_array[2][2]
                main_array[2][2] = 0
                lose_check--
            }

            if ((main_array[2][2] == main_array[2][3]) && (main_array[2][2] != 0)) {
                main_array[2][2] = main_array[2][2] + main_array[2][3]
                main_array[2][3] = 0
                lose_check--
            }

            //

            if ((main_array[3][0] == main_array[3][1]) && (main_array[3][0] != 0)) {
                main_array[3][0] = main_array[3][0] + main_array[3][1]
                main_array[3][1] = 0
                lose_check--
            }

            if ((main_array[3][1] == main_array[3][2]) && (main_array[3][1] != 0)) {
                main_array[3][1] = main_array[3][1] + main_array[3][2]
                main_array[3][2] = 0
                lose_check--
            }

            if ((main_array[3][2] == main_array[3][3]) && (main_array[3][2] != 0)) {
                main_array[3][2] = main_array[3][2] + main_array[3][3]
                main_array[3][3] = 0
                lose_check--
            }

        }

        fun win_check_fun () {
            if (main_array[0][0] == 2048 || main_array[0][1] == 2048 || main_array[0][2] == 2048 || main_array[0][3] == 2048 ||
                    main_array[1][0] == 2048 || main_array[1][1] == 2048 || main_array[1][2] == 2048 || main_array[1][3] == 2048 ||
                    main_array[2][0] == 2048 || main_array[2][1] == 2048 || main_array[2][2] == 2048 || main_array[2][3] == 2048 ||
                    main_array[3][0] == 2048 || main_array[3][1] == 2048 || main_array[3][2] == 2048 || main_array[3][3] == 2048) {

                win_check = 1

            }
        }



        up_Button.setOnClickListener {

            vert_algorithm()
            sort_up()
            display()
            win_check_fun()

            if (lose_check == 16 || win_check == 1) {

                up_Button.isClickable = false
                left_Button.isClickable = false
                right_Button.isClickable = false
                down_Button.isClickable = false
                play_Button.isClickable = true
                if (lose_check == 16) {
                    TV_interract.text = "You lost"
                }

                if (win_check == 1) {
                    TV_interract.text = "You won!"
                }

            } else {
                add_number()
                display()
            }
        }

        left_Button.setOnClickListener {

            hor_algorithm()
            sort_left()
            display()
            win_check_fun()

            if (lose_check == 16 || win_check == 1) {

                up_Button.isClickable = false
                left_Button.isClickable = false
                right_Button.isClickable = false
                down_Button.isClickable = false
                play_Button.isClickable = true
                if (lose_check == 16) {
                    TV_interract.text = "You lost"
                }

                if (win_check == 1) {
                    TV_interract.text = "You won!"
                }

            } else {
                add_number()
                display()
            }

        }

        right_Button.setOnClickListener {

            hor_algorithm()
            sort_right()
            display()
            win_check_fun()

            if (lose_check == 16 || win_check == 1) {

                up_Button.isClickable = false
                left_Button.isClickable = false
                right_Button.isClickable = false
                down_Button.isClickable = false
                play_Button.isClickable = true
                if (lose_check == 16) {
                    TV_interract.text = "You lost"
                }

                if (win_check == 1) {
                    TV_interract.text = "You won!"
                }

            } else {
                add_number()
                display()
            }

        }

        down_Button.setOnClickListener {

            vert_algorithm()
            sort_down()
            display()
            win_check_fun()

            if (lose_check == 16 || win_check == 1) {

                up_Button.isClickable = false
                left_Button.isClickable = false
                right_Button.isClickable = false
                down_Button.isClickable = false
                play_Button.isClickable = true
                if (lose_check == 16) {
                    TV_interract.text = "You lost"
                }

                if (win_check == 1) {
                    TV_interract.text = "You won!"
                }

            } else {
                add_number()
                display()
            }

        }



        play_Button.setOnClickListener {

            TV_interract.text = "Enjoy the game!"
            up_Button.isClickable = true
            left_Button.isClickable = true
            right_Button.isClickable = true
            down_Button.isClickable = true

            TV_00.text = "0"
            TV_01.text = "0"
            TV_02.text = "0"
            TV_03.text = "0"
            TV_10.text = "0"
            TV_11.text = "0"
            TV_12.text = "0"
            TV_13.text = "0"
            TV_20.text = "0"
            TV_21.text = "0"
            TV_22.text = "0"
            TV_23.text = "0"
            TV_30.text = "0"
            TV_31.text = "0"
            TV_32.text = "0"
            TV_33.text = "0"

            for (i in 0..3) {
                for (j in 0..3) {
                    main_array[i][j] = 0
                }
            }

            lose_check=0
            win_check=0

            add_number()
            display()

            play_Button.isClickable = false
        }

    }

}