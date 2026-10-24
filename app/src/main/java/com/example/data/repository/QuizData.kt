package com.example.data.repository

import com.example.data.model.QuizQuestion

object QuizData {
    val questions: List<QuizQuestion> = listOf(
        QuizQuestion(
            id = 1,
            lessonId = 1,
            question = "Vietnamese me kisi ko 'Namaste' ya 'Hello' kehne ke liye kya bolte hain?",
            questionHinglish = "What is the polite universal greeting in Vietnamese?",
            options = listOf("Cảm ơn", "Xin chào", "Tạm biệt", "Xin lỗi"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Xin chào' (Sin chow) universal greeting hai. 'Cảm ơn' ka matlab Thank you aur 'Tạm biệt' ka matlab Goodbye hota hai."
        ),
        QuizQuestion(
            id = 2,
            lessonId = 1,
            question = "'Cảm ơn' shabd ka sahi arth kya hai?",
            questionHinglish = "What does 'Cảm ơn' mean?",
            options = listOf("Dhanyawad / Thank you", "Maaf kijiye / Sorry", "Kripya / Please", "Alvida / Bye"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Cảm ơn' ka matlab Shukriya / Thank you hota hai. Isme 'Cảm' par dipping tone hoti hai."
        ),
        QuizQuestion(
            id = 3,
            lessonId = 1,
            question = "Bheed me kisi se rasta maangne ya galti par 'Excuse me / Sorry' bolne ke liye kya kahenge?",
            questionHinglish = "Which phrase is used for 'Excuse me' or 'Sorry'?",
            options = listOf("Xin lỗi", "Không có chi", "Chúc ngủ ngon", "Dạ"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Xin lỗi' (Sin loy~) ka matlab Excuse me ya Sorry hota hai."
        ),
        QuizQuestion(
            id = 4,
            lessonId = 1,
            question = "South Vietnam me polite 'Haanji' (Yes) kehne ke liye kaunsa shabd use hota hai?",
            questionHinglish = "Which respectful affirmative word is used in Southern Vietnam?",
            options = listOf("Không", "Dạ", "Mà", "Đi"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Dạ' (Zaa. / Yaa.) bado se respect se 'Haanji' kehne ke liye use hota hai. North me 'Vâng' bolte hain."
        ),
        QuizQuestion(
            id = 5,
            lessonId = 2,
            question = "Agar aap kisi thode bade ladke (Bhaiya) se baat kar rahe hain, toh unhe kya kahenge?",
            questionHinglish = "How do you politely address a slightly older male (like Indian 'Bhaiya')?",
            options = listOf("Em", "Chị", "Anh", "Bác"),
            correctAnswerIndex = 2,
            explanationHinglish = "'Anh' (Aynh) older male / Bhaiya ke liye use hota hai. 'Chị' didi ke liye aur 'Em' younger person ke liye."
        ),
        QuizQuestion(
            id = 6,
            lessonId = 2,
            question = "Agar aap 'Anh' (bhaiya) se baat kar rahe hain, toh khud ko (I / Me) kya bolenge?",
            questionHinglish = "If addressing an older male as 'Anh', what pronoun should you use for yourself?",
            options = listOf("Tôi", "Em", "Bạn", "Cô"),
            correctAnswerIndex = 1,
            explanationHinglish = "Pairing rule: Agar samne wala 'Anh' hai, toh aap chhote hone ke naate khud ko 'Em' bolenge (e.g. 'Em cảm ơn anh')."
        ),
        QuizQuestion(
            id = 7,
            lessonId = 2,
            question = "Papa ki umar ke buzurg uncle (Chachaji) ko address karne ke liye kaunsa pronoun sahi hai?",
            questionHinglish = "Which pronoun represents an uncle figure around your father's age?",
            options = listOf("Chú", "Chị", "Em", "Anh"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Chú' (Choo') uncle / Chachaji ke liye use hota hai. 'Bác' tauji ya dada ji ke liye."
        ),
        QuizQuestion(
            id = 8,
            lessonId = 3,
            question = "Vietnamese ginti me 'Một, hai, ba' ka kya matlab hai?",
            questionHinglish = "What do 'Một, hai, ba' count up to?",
            options = listOf("4, 5, 6", "1, 2, 3", "10, 20, 30", "7, 8, 9"),
            correctAnswerIndex = 1,
            explanationHinglish = "Một = 1, Hai = 2, Ba = 3. Bar me toast karte waqt 'Một, hai, ba, dzô!' chillate hain!"
        ),
        QuizQuestion(
            id = 9,
            lessonId = 3,
            question = "Vietnamese currency me 'Một triệu' (1 Million VND) lagbhag kitne Indian Rupees ke barabar hota hai?",
            questionHinglish = "Approximately how much is 1 Million Dong (Một triệu) in Indian Rupees (INR)?",
            options = listOf("Lagbhag 340 INR", "Lagbhag 3,400 INR", "Lagbhag 34,000 INR", "Lagbhag 34 INR"),
            correctAnswerIndex = 1,
            explanationHinglish = "1 Million (10 Lakh) Dong lagbhag 3,400 INR hota hai. (1 INR ~ 290-300 VND)."
        ),
        QuizQuestion(
            id = 10,
            lessonId = 3,
            question = "Number '5' ko Vietnamese me kya bolte hain?",
            questionHinglish = "What is the word for the number 5?",
            options = listOf("Bốn", "Sáu", "Năm", "Tám"),
            correctAnswerIndex = 2,
            explanationHinglish = "Năm = 5. (Bốn = 4, Sáu = 6, Tám = 8)."
        ),
        QuizQuestion(
            id = 11,
            lessonId = 4,
            question = "Agar aap shakahari hain, toh restaurant me 'Pure Veg khana' maangne ke liye kya bolenge?",
            questionHinglish = "What essential phrase means 'I am vegetarian' in Vietnam?",
            options = listOf("Tôi ăn chay", "Tôi ăn thịt", "Tôi uống cà phê", "Tôi đi ngủ"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Tôi ăn chay' (Un chai) ka matlab hai 'Main shakahari hoon'. 'Ăn' = khana, 'Chay' = vegetarian."
        ),
        QuizQuestion(
            id = 12,
            lessonId = 4,
            question = "Vietnamese soups me fish sauce se bachne ke liye aapko kya bolna chahiye?",
            questionHinglish = "How do you request food without fish sauce?",
            options = listOf("Nhiều nước mắm", "Không nước mắm", "Cho nước mắm", "Nước mắm ngon"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Không nước mắm' ka matlab hai 'Fish sauce mat daalna'. 'Không' = No/Without."
        ),
        QuizQuestion(
            id = 13,
            lessonId = 4,
            question = "Mashhoor Vietnamese condensed milk wali cold coffee ka sahi naam kya hai?",
            questionHinglish = "What is the iconic Vietnamese iced milk coffee called?",
            options = listOf("Cà phê đen", "Trà đá", "Cà phê sữa đá", "Nước suối"),
            correctAnswerIndex = 2,
            explanationHinglish = "'Cà phê sữa đá' = Cà phê (coffee) + sữa (milk) + đá (ice)."
        ),
        QuizQuestion(
            id = 14,
            lessonId = 4,
            question = "Famous noodle soup 'Phở' ka sahi ucharan (pronunciation) kya hai?",
            questionHinglish = "What is the correct pronunciation of the national soup 'Phở'?",
            options = listOf("'P-H-O' (Po)", "'Fuh?' (dipping question tone)", "'Phor'", "'Fee'"),
            correctAnswerIndex = 1,
            explanationHinglish = "Vietnamese me 'PH' = F sound hota hai, aur 'ở' par question mark tone hoti hai, isliye ise 'Fuh?' bolte hain!"
        ),
        QuizQuestion(
            id = 15,
            lessonId = 5,
            question = "'Washroom / Toilet kahan hai?' ko Vietnamese me kaise poochenge?",
            questionHinglish = "How do you ask 'Where is the restroom / toilet?'",
            options = listOf("Nhà vệ sinh ở đâu?", "Sân bay ở đâu?", "Khách sạn ở đâu?", "Chợ ở đâu?"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Nhà vệ sinh' = Toilet / Restroom, aur 'ở đâu?' = Kahan hai?"
        ),
        QuizQuestion(
            id = 16,
            lessonId = 5,
            question = "'Đi thẳng rồi rẽ trái' ka kya matlab hai?",
            questionHinglish = "What does 'Đi thẳng rồi rẽ trái' mean?",
            options = listOf("Ruko fir right mudo", "Seedhe jao fir left mudo", "U-turn lo", "Dhire chalo"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Đi thẳng' = Seedhe jao, 'rồi' = fir, 'rẽ trái' = left mudo."
        ),
        QuizQuestion(
            id = 17,
            lessonId = 6,
            question = "Bazaar me bargaining karte waqt 'Bohot mehenga hai!' kehne ke liye kya bolenge?",
            questionHinglish = "What do you say to express 'Too expensive!' when shopping?",
            options = listOf("Rẻ quá!", "Đắt quá!", "Ngon quá!", "Đẹp quá!"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Đắt quá!' (Dut' kwah') ka matlab hai 'Bohot mehenga hai!'. (Rẻ quá = Bohot sasta hai)."
        ),
        QuizQuestion(
            id = 18,
            lessonId = 6,
            question = "'Bớt được không?' phrase ka Hindi me kya matlab hota hai?",
            questionHinglish = "What is the meaning of the bargaining phrase 'Bớt được không?'",
            options = listOf("Dukaan band hai kya?", "Thoda kam hoga / Discount milega?", "Yeh naya piece hai?", "Paise nahi hain"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Bớt được không?' bargaining ke liye use hota hai: 'Kya thoda discount milega / daam kam hoga?'."
        ),
        QuizQuestion(
            id = 19,
            lessonId = 7,
            question = "Vietnam ki traditional two-wheeler motorbike taxi ko kya kehte hain?",
            questionHinglish = "What is the popular Vietnamese motorcycle taxi called?",
            options = listOf("Xe buýt", "Xe ôm", "Ga tàu", "Xe đạp"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Xe ôm' (literally hugging bike) motorbike taxi hoti hai jo har road par available rehti hai."
        ),
        QuizQuestion(
            id = 20,
            lessonId = 7,
            question = "Taxi driver ko 'Yahan rok dijiye' bolne ke liye kaunsa phrase use karenge?",
            questionHinglish = "How do you tell a taxi driver to 'Stop here'?",
            options = listOf("Đi nhanh lên", "Dừng lại ở đây", "Đi thẳng", "Rẽ phải"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Dừng lại ở đây' = Yahan rok dijiye (Stop here)."
        ),
        QuizQuestion(
            id = 21,
            lessonId = 8,
            question = "Achanak emergency aane par 'Help me! / Bachao!' bolne ke liye kya chillana chahiye?",
            questionHinglish = "What is the emergency cry for 'Help me!'?",
            options = listOf("Cứu tôi với!", "Chúc mừng!", "Tạm biệt!", "Hẹn gặp lại!"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Cứu tôi với!' (Kew' toy vuh-y') = Bachao mujhe / Help me!"
        ),
        QuizQuestion(
            id = 22,
            lessonId = 8,
            question = "'Tiệm thuốc' ka matlab kya hota hai?",
            questionHinglish = "What does 'Tiệm thuốc' refer to?",
            options = listOf("Coffee shop", "Medical store / Pharmacy", "Police station", "Airport"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Tiệm thuốc' dawai ki dukaan (pharmacy / chemist) hoti hai."
        ),
        QuizQuestion(
            id = 23,
            lessonId = 9,
            question = "'Bây giờ là mấy giờ?' ka kya matlab hai?",
            questionHinglish = "What does 'Bây giờ là mấy giờ?' ask?",
            options = listOf("Aaj kaun sa din hai?", "Abhi kitne baje hain?", "Aap kahan ja rahe ho?", "Kitne paise huye?"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Bây giờ là mấy giờ?' = Abhi kitne baj rahe hain? (What time is it right now?)."
        ),
        QuizQuestion(
            id = 24,
            lessonId = 9,
            question = "'Ngày mai' shabd ka kya arth hota hai?",
            questionHinglish = "What does 'Ngày mai' mean?",
            options = listOf("Aaj (Today)", "Kal (Tomorrow)", "Beeta hua kal (Yesterday)", "Agla saal"),
            correctAnswerIndex = 1,
            explanationHinglish = "'Ngày mai' = Kal aane wala (Tomorrow). 'Hôm nay' = Aaj, 'Hôm qua' = Beeta kal."
        ),
        QuizQuestion(
            id = 25,
            lessonId = 10,
            question = "Vietnamese me 'Main Indian hoon' bolne ka sahi sentence kaun sa hai?",
            questionHinglish = "Which sentence correctly says 'I am Indian'?",
            options = listOf("Tôi là người Ấn Độ", "Tôi đi Ấn Độ", "Tôi thích ăn cơm", "Tôi không biết"),
            correctAnswerIndex = 0,
            explanationHinglish = "'Tôi là người Ấn Độ' (Người = person, Ấn Độ = India/Bharat)."
        ),
        QuizQuestion(
            id = 26,
            lessonId = 10,
            question = "Doston ke sath cheers karte waqt 'Một, hai, ba, dzô!' me 'dzô' ka ucharan kaise hota hai?",
            questionHinglish = "How is 'dzô' pronounced in the cheers chant?",
            options = listOf("'Doh'", "'Zoh' ya 'Yoh'", "'Zoo'", "'Dzo-dzo'"),
            correctAnswerIndex = 1,
            explanationHinglish = "'dzô' ko 'Zoh' (North) ya 'Yoh' (South) jaisa loud cheer ke sath bolte hain!"
        ),
        QuizQuestion(
            id = 27,
            lessonId = null,
            question = "Vietnamese bhasha me kul kitne tones (sur) hote hain?",
            questionHinglish = "How many tones exist in the Vietnamese language?",
            options = listOf("4 tones", "5 tones", "6 tones", "8 tones"),
            correctAnswerIndex = 2,
            explanationHinglish = "Vietnamese me 6 tones hote hain: Ngang (flat), Huyền (falling), Sắc (rising), Hỏi (dipping), Ngã (glottal break), Nặng (heavy drop)."
        ),
        QuizQuestion(
            id = 28,
            lessonId = null,
            question = "Underdot wali tone (Thanh Nặng jaise 'Mẹ' ya 'Bạn') ki kya pehchan hai?",
            questionHinglish = "What describes Thanh Nặng (the underdot tone)?",
            options = listOf("Awaaz upar udti hai", "Awaaz achanak neeche girkar abrupt stop ho jaati hai", "Awaaz flat rehti hai", "Awaaz me question hota hai"),
            correctAnswerIndex = 1,
            explanationHinglish = "Thanh Nặng bohot short, low aur abrupt drop wali tone hoti hai jisme sound gale me lock ho jata hai."
        ),
        QuizQuestion(
            id = 29,
            lessonId = null,
            question = "Vietnamese me 'PH' (jaise Phở ya Cà phê) ka sound kis consonant jaisa hota hai?",
            questionHinglish = "What English/Hindi consonant does Vietnamese 'PH' sound like?",
            options = listOf("P (Patang)", "F (Fal / Fun)", "B (Bakri)", "H (Hathi)"),
            correctAnswerIndex = 1,
            explanationHinglish = "Vietnamese 'PH' hamesha 'F' pronounce hota hai! Isliye 'Phở' ko 'Fuh' bolte hain."
        ),
        QuizQuestion(
            id = 30,
            lessonId = null,
            question = "'D' bina cross bar ke (jaise 'Dạ') North Vietnam me kaise sound karta hai?",
            questionHinglish = "How is uncrossed 'D' pronounced in Northern Vietnam?",
            options = listOf("D (English Dog)", "Z (Zebra)", "T (Tomato)", "L (Lion)"),
            correctAnswerIndex = 1,
            explanationHinglish = "Uncrossed 'D' North me 'Z' aur South me 'Y' sound karta hai. Jabki cross wala 'Đ' regular 'D' sound hota hai."
        )
    )
}
