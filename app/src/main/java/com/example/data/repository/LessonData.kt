package com.example.data.repository

import com.example.data.model.DialogueLine
import com.example.data.model.Lesson
import com.example.data.model.LessonSection

object LessonData {
    val lessons: List<Lesson> = listOf(
        Lesson(
            id = 1,
            title = "Greetings & Polite Etiquette",
            titleHinglish = "Namaste aur Basic Polite Baatein",
            subtitle = "Xin chào, Cảm ơn, Xin lỗi aur Dạ/Vâng bolna seekhein",
            category = "Basics",
            estimatedMinutes = 10,
            introHinglish = "Vietnam me entry karte hi sabse pehle aapko 'Xin chào' aur 'Cảm ơn' bolna aana chahiye. Vietnamese log respectful tone bohot pasand karte hain.",
            indianAnalogy = "Jaise hum India me kisi ko respect se 'Namaste ji' ya 'Dhanyawad' bolte hain, bilkul wahi vibe hai.",
            sections = listOf(
                LessonSection(
                    heading = "1. Hello bolne ka tarika: Xin chào",
                    contentHinglish = "'Xin chào' (pronounce: Sin chow) universal greeting hai. 'Xin' ka matlab polite request hota hai aur 'chào' ka matlab greet karna.",
                    bulletPoints = listOf(
                        "Sin: seedhi flat tone hai",
                        "Chào: gentle falling tone hai (` mark)",
                        "Casual dosto ke beech log sirf 'Chào bạn' ya 'Chào anh' bolte hain"
                    ),
                    examplePhrase = "Xin chào! Bạn khỏe không?",
                    exampleMeaning = "Namaste! Aap kaise hain?"
                ),
                LessonSection(
                    heading = "2. Shukriya: Cảm ơn",
                    contentHinglish = "'Cảm ơn' (pronounce: Kaam? un) ka matlab Thank you hota hai. 'Cảm' me Hỏi tone (hook) hota hai jo dip karta hai.",
                    bulletPoints = listOf(
                        "Bohot zyada shukriya kehna ho toh bolo: 'Cảm ơn rất nhiều!'",
                        "Agar koi aapko shukriya kahe, toh aap keh sakte hain: 'Không có chi' (Koi baat nahi / You are welcome)"
                    ),
                    examplePhrase = "Cảm ơn bạn rất nhiều!",
                    exampleMeaning = "Aapka bohot bohot shukriya!"
                ),
                LessonSection(
                    heading = "3. Maafi maangna: Xin lỗi",
                    contentHinglish = "Bheed me raasta maangna ho ya galti ho jaye, toh 'Xin lỗi' (Sin loy~) bolte hain. 'Lỗi' me tilde mark (~) hota hai.",
                    bulletPoints = listOf(
                        "Kisi waiter ya stranger ka dhyan kheenchne ke liye 'Xin lỗi' bohot polite tarika hai",
                        "Jaise hum 'Excuse me bhaiya' bolte hain"
                    ),
                    examplePhrase = "Xin lỗi, cho tôi hỏi...",
                    exampleMeaning = "Excuse me, mujhe ek baat poochne dijiye..."
                ),
                LessonSection(
                    heading = "4. Haanji aur Respect marker: Dạ / Vâng",
                    contentHinglish = "South Vietnam me 'Dạ' (Zaa. / Yaa.) aur North me 'Vâng' (Vung) bola jata hai. Yeh Hindi ke 'Haanji' jaisa hota hai.",
                    bulletPoints = listOf(
                        "Bado se baat karte waqt sentence ke aage 'Dạ' lagana bohot sanskari maana jata hai",
                        "Sentence ke end me 'ạ' lagana bhi respect deta hai (jaise: Cảm ơn bác ạ!)"
                    ),
                    examplePhrase = "Dạ, vâng ạ!",
                    exampleMeaning = "Haanji, bilkul ji!"
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Greetings" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Rahul", "Indian Tourist", "Xin chào chị!", "Sin chow chee.!", "Namaste didi!"),
                DialogueLine("Lan", "Shopkeeper", "Chào em! Em khỏe không?", "Chow em! Em khweh? khawng?", "Hello bhai! Tum theek ho?"),
                DialogueLine("Rahul", "Indian Tourist", "Dạ, em khỏe. Cảm ơn chị!", "Zaa., em khweh?. Kaam? un chee.!", "Haanji, main theek hoon. Thank you didi!"),
                DialogueLine("Lan", "Shopkeeper", "Không có chi!", "Khawng caw' chee", "Koi baat nahi!")
            )
        ),

        Lesson(
            id = 2,
            title = "Pronouns & Respect Hierarchy",
            titleHinglish = "Bhaiya, Didi aur Indian Parivar jaisa System",
            subtitle = "Anh, Chị, Em, Bác, Chú ka jaadu seekhein",
            category = "Grammar",
            estimatedMinutes = 12,
            introHinglish = "Vietnamese me English jaisa simple 'I' aur 'You' bolna aksar rude lagta hai! Yahan poori country ek joint family ki tarah ek doosre ko रिश्ते ke hisaab se address karti hai.",
            indianAnalogy = "Bilkul India jaisa! Hum auto wale ko 'Bhaiya', dukan wali ko 'Didi', buzurg ko 'Chacha ji / Uncle' bolte hain na? Vietnamese me bhi exact same rule hai!",
            sections = listOf(
                LessonSection(
                    heading = "1. Golden Rule: Age aur Gender ke hisaab se Pronouns",
                    contentHinglish = "Aap saamne wale ki umar dekhkar pronoun chunte hain:",
                    bulletPoints = listOf(
                        "Anh (Aynh): Agar saamne wala ladka aap se thoda bada hai ('Bhaiya')",
                        "Chị (Chee.): Agar saamne wali mahila aap se thodi badi hai ('Didi')",
                        "Em (Em): Agar saamne wala aapse chhota hai (chhota bhai/behen ya student)",
                        "Chú (Choo'): Papa ki umar ke uncle ('Chachaji')",
                        "Cô (Koh): Mummy ki umar ki aunty ya lady teacher",
                        "Bác (Baak'): Dada/Dadi ya tauji jaisi buzurg umar wale log"
                    ),
                    examplePhrase = "Chào anh, chào chị!",
                    exampleMeaning = "Namaste bhaiya, namaste didi!"
                ),
                LessonSection(
                    heading = "2. 'Main' aur 'Aap' ka relation pairing",
                    contentHinglish = "Agar aap kisi ladke ko 'Anh' bol rahe hain, toh khud ko 'Em' bolenge!",
                    bulletPoints = listOf(
                        "Jab main chhota hoon: 'Em chào anh' (Main bhaiya ko namaste karta hoon)",
                        "Jab main bada hoon: 'Anh cảm ơn em' (Bhaiya chote ko thank you bol raha hai)",
                        "Stranger ke sath neutral formal: 'Tôi' (Main) aur 'Bạn' (Aap/Friend)"
                    ),
                    examplePhrase = "Em muốn mua cái này, chị ơi.",
                    exampleMeaning = "Didi, main yeh kharidna chahta hoon."
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Pronouns" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Amit", "Indian Buyer", "Anh ơi, cái này bao nhiêu?", "Aynh uy, kaay' naay bow nyew?", "Bhaiya suniye, yeh kitne ka hai?"),
                DialogueLine("Minh", "Older Vendor", "Hai mươi nghìn em nhé.", "Haay mu-oy ngeen em nyeh'", "Bees hazaar (20k) chote bhai."),
                DialogueLine("Amit", "Indian Buyer", "Dạ, em cảm ơn anh!", "Zaa., em kaam? un aynh!", "Haanji, thank you bhaiya!")
            )
        ),

        Lesson(
            id = 3,
            title = "Numbers & Money (Triệu vs Lakhs)",
            titleHinglish = "Ginti aur Vietnamese Dong ki Calculation",
            subtitle = "0 se 100+ ginti aur currency convert karna",
            category = "Practical",
            estimatedMinutes = 15,
            introHinglish = "Vietnam ki currency 'Đồng' (VND) hai. Yahan sab kuch hazaron aur lakhon me hota hai! Ek cup coffee 30,000 Dong (~ 100 INR) ki hoti hai.",
            indianAnalogy = "Quick trick for Indians: Aakhri ke 3 zero hatao aur bache huye number ko 3.4 se divide karo! (Example: 100,000 VND -> 100 / 3.4 ~ 30 INR ya 100k = ~340 INR).",
            sections = listOf(
                LessonSection(
                    heading = "1. Basic Ginti (1 se 10)",
                    contentHinglish = "Yeh 10 numbers aapko har menu aur bargaining me kaam aayenge:",
                    bulletPoints = listOf(
                        "1: Một (Mo't.), 2: Hai (Haay), 3: Ba (Baa)",
                        "4: Bốn (Bohn'), 5: Năm (Num), 6: Sáu (Show')",
                        "7: Bảy (Baay?), 8: Tám (Taam'), 9: Chín (Cheen'), 10: Mười (Mu-oy)"
                    ),
                    examplePhrase = "Một, hai, ba, dzô!",
                    exampleMeaning = "1, 2, 3, Cheers!"
                ),
                LessonSection(
                    heading = "2. Hazaron aur Lakhon ki Currency",
                    contentHinglish = "Vietnam me coins nahi hote, sirf paper notes hote hain:",
                    bulletPoints = listOf(
                        "Nghìn / Ngàn: Hazaar (1,000). Example: Mười nghìn = 10,000 VND",
                        "Trăm nghìn: Ek sau hazaar (100,000 VND)",
                        "Triệu: 1 Million (10 Lakhs). Example: Một triệu = 1,000,000 VND (~ 3,400 INR)"
                    ),
                    examplePhrase = "Năm mươi nghìn đồng.",
                    exampleMeaning = "Pachaas hazaar Dong (50,000 VND)."
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Numbers" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Tourist", "Buyer", "Cà phê sữa đá bao nhiêu một ly?", "Kaa fey suu~ah daa' bow nyew mo't lee?", "Cold coffee ek glass kitne ki hai?"),
                DialogueLine("Server", "Coffee seller", "Hai mươi lăm nghìn đồng anh ơi.", "Haay mu-oy lum ngeen dawng aynh uy", "Pachhis hazaar Dong (25,000 VND) bhaiya."),
                DialogueLine("Tourist", "Buyer", "Cho tôi hai ly nhé!", "Chaw toy haay lee nyeh'!", "Mujhe do glass dijiye please!")
            )
        ),

        Lesson(
            id = 4,
            title = "Food & Vegetarian Survival Guide",
            titleHinglish = "Khaana aur Pure Veg (Ăn Chay) Tips",
            subtitle = "Indian travelers ke liye shakahari khana dhoondhna",
            category = "Food",
            estimatedMinutes = 15,
            introHinglish = "Indian vegetarians ke liye Vietnam me 'Ăn Chay' (Un Chai) sabse zaroori mantra hai! Vietnam Buddhist country hai, isliye lagbhag har galli me 'Quán Chay' (Veg restaurant) milta hai.",
            indianAnalogy = "Jaise India me 'Shuddh Shakahari' board hota hai, Vietnam me restaurant ke bahar 'CHAY' likha ho toh samjho 100% pure veg plant-based khana milega!",
            sections = listOf(
                LessonSection(
                    heading = "1. Shakahari bolne ka mantra: Tôi ăn chay",
                    contentHinglish = "Restaurant me baith-te hi yeh line bolein:",
                    bulletPoints = listOf(
                        "'Tôi ăn chay': Main pure veg hoon",
                        "'Không thịt': Meat bilkul mat daalna",
                        "'Không nước mắm': Fish sauce mat daalna (Fish sauce sabhi normal soup me hota hai)",
                        "'Có trứng không?': Kya isme egg hai? (Agar bina ande ka chahiye)"
                    ),
                    examplePhrase = "Tôi ăn chay, làm ơn không nước mắm!",
                    exampleMeaning = "Main veg hoon, please fish sauce mat daaliye!"
                ),
                LessonSection(
                    heading = "2. Mashhoor Dishes jo aapko try karni chahiye",
                    contentHinglish = "Popular Vietnamese food:",
                    bulletPoints = listOf(
                        "Phở chay (Fuh? chai): Rice noodle soup with mushrooms and herbs",
                        "Bánh mì chay (Baan' mee chai): French bread sandwich with tofu and vegetables",
                        "Đậu sốt cà chua: Tofu in tomato gravy (Bilkul paneer jaisa lagta hai!)",
                        "Cà phê sữa đá: Sweet cold coffee with condensed milk"
                    ),
                    examplePhrase = "Cho tôi một tô phở chay và trà đá.",
                    exampleMeaning = "Mujhe ek bowl veg pho aur iced tea dijiye."
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Food" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Pooja", "Indian Traveler", "Cô ơi, ở đây có món chay không?", "Koh uy, uh? daay caw' mawn' chai khawng?", "Aunty ji, kya yahan veg dish milegi?"),
                DialogueLine("Cook", "Vietnamese Cook", "Có chứ! Có phở chay và cơm chiên chay.", "Caw' chu'! Caw' fuh? chai vaa kuhm chee-en chai.", "Haan bilkul! Veg pho aur veg fried rice dono hain."),
                DialogueLine("Pooja", "Indian Traveler", "Tuyệt vời! Cho cháu một tô phở chay nhé.", "Too-yet. vuh-y! Chaw chow' mo't toh fuh? chai nyeh'.", "Awesome! Mere liye ek bowl veg pho laaiye.")
            )
        ),

        Lesson(
            id = 5,
            title = "Asking Questions & Directions",
            titleHinglish = "Sawaal Poochna aur Rasta Pata Karna",
            subtitle = "Ở đâu, Bao nhiêu, Cái gì aur Rẽ trái / phải",
            category = "Practical",
            estimatedMinutes = 12,
            introHinglish = "Kahin bhi ghoomte waqt washroom, hotel ya tourist spot ka rasta poochna sabse ahem skill hai.",
            indianAnalogy = "Jaise hum Delhi ya Mumbai me 'Bhaiya station kahan hai?' poochte hain, wahan bolo: 'Anh ơi, ga tàu ở đâu?'",
            sections = listOf(
                LessonSection(
                    heading = "1. 'Kahan hai?' poochne ka rule: ... Ở đâu?",
                    contentHinglish = "Bas jagah ka naam aage lagao aur aakhri me 'ở đâu?' jod do!",
                    bulletPoints = listOf(
                        "Nhà vệ sinh ở đâu?: Washroom kahan hai?",
                        "Khách sạn ở đâu?: Hotel kahan hai?",
                        "Sân bay ở đâu?: Airport kahan hai?",
                        "Chợ ở đâu?: Market kahan hai?"
                    ),
                    examplePhrase = "Xin lỗi, nhà vệ sinh ở đâu ạ?",
                    exampleMeaning = "Excuse me, washroom kahan hai ji?"
                ),
                LessonSection(
                    heading = "2. Directions samajhna",
                    contentHinglish = "Jab samne wala rasta bataye toh yeh words dhyan se sunein:",
                    bulletPoints = listOf(
                        "Đi thẳng: Seedhe jao (Go straight)",
                        "Rẽ trái: Left mudo (Turn left)",
                        "Rẽ phải: Right mudo (Turn right)",
                        "Ở đây: Yahan par (Here)",
                        "Ở kia: Wahan par (Over there)"
                    ),
                    examplePhrase = "Đi thẳng năm mươi mét rồi rẽ phải.",
                    exampleMeaning = "50 meter seedhe jao fir right mudo."
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Directions" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Traveler", "Tourist", "Anh ơi, cho em hỏi chợ ở đâu?", "Aynh uy, chaw em hoy? chuh. uh? dow?", "Bhaiya suniye, market kahan hai?"),
                DialogueLine("Local", "Hanoi Resident", "Em đi thẳng rồi rẽ trái là thấy.", "Em dee thung? zoy ze~ traay' laa tay'.", "Chote seedhe jaake left mudo, dikh jayegi."),
                DialogueLine("Traveler", "Tourist", "Dạ, em cảm ơn anh nhiều!", "Zaa., em kaam? un aynh nyew!", "Haanji, bohot bohot shukriya bhaiya!")
            )
        ),

        Lesson(
            id = 6,
            title = "Street Shopping & Bargaining",
            titleHinglish = "Bazaar me Shopping aur Bargaining",
            subtitle = "Đắt quá, Bớt được không aur Colors",
            category = "Shopping",
            estimatedMinutes = 12,
            introHinglish = "Ben Thanh Market (Ho Chi Minh City) ya Dong Xuan Market (Hanoi) me bargaining ek game ki tarah hai!",
            indianAnalogy = "Indian street markets (Sarojini Nagar / Colaba Causeway) ka rule Vietnam me bhi 100% apply hota hai: Pehla quote sunkar bolo 'Đắt quá!' (Bohot mehenga hai!).",
            sections = listOf(
                LessonSection(
                    heading = "1. Keemat poochna aur Reaction dena",
                    contentHinglish = "Dukaan par communication steps:",
                    bulletPoints = listOf(
                        "Step 1: 'Cái này bao nhiêu tiền?' (Yeh kitne ka hai?)",
                        "Step 2: Keemat sunkar smile karke bolo: 'Đắt quá!' (Bohot mehenga hai!)",
                        "Step 3: 'Bớt được không chị?' (Thoda discount milega didi?)"
                    ),
                    examplePhrase = "Trời ơi, đắt quá! Bớt đi chị!",
                    exampleMeaning = "Are baap re, bohot mehenga hai! Thoda kam karo didi!"
                ),
                LessonSection(
                    heading = "2. Deal confirm karna ya Mana karna",
                    contentHinglish = "Agar deal pasand aaye toh 'Tôi mua cái này' (Main yeh le raha hoon). Agar pasand na aaye toh polite smile dekar 'Cảm ơn, thôi nhé' bolkar aage badhein.",
                    bulletPoints = listOf(
                        "Có màu khác không?: Dusra color hai kya?",
                        "Cái này đẹp quá: Yeh bohot sundar hai",
                        "Giảm giá: Discount / Sale"
                    ),
                    examplePhrase = "Một trăm nghìn được không?",
                    exampleMeaning = "Kya 100k Dong (ek sau hazaar) me doge?"
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Shopping" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Shopper", "Buyer", "Chị ơi, nón lá này bao nhiêu tiền?", "Chee. uy, nawn' laa' naay bow nyew tee-en?", "Didi, yeh conical hat kitne ki hai?"),
                DialogueLine("Seller", "Shopkeeper", "Hai trăm nghìn em ơi.", "Haay chum ngeen em uy.", "Do sau hazaar (200k VND) chote bhai."),
                DialogueLine("Shopper", "Buyer", "Đắt quá! Một trăm nghìn được không chị?", "Dut' kwah'! Mo't chum ngeen du-uk. khawng chee.?", "Bohot mehenga hai! 100k me doge kya?"),
                DialogueLine("Seller", "Shopkeeper", "Thôi được, một trăm hai mươi nghìn nhé!", "Toy du-uk., mo't chum haay mu-oy ngeen nyeh'!", "Chalo theek hai, 120k de do!")
            )
        ),

        Lesson(
            id = 7,
            title = "Transport: Grab & Xe Ôm (Bike Taxi)",
            titleHinglish = "Cab, Bike Taxi aur Safar karna",
            subtitle = "Xe ôm, Taxi, Airport aur Ga tàu",
            category = "Travel",
            estimatedMinutes = 10,
            introHinglish = "Vietnam me bike taxi ('Xe ôm') aur Grab app har jagah chalti hai. Traffic tez hota hai lekin travel sasta aur exciting hota hai.",
            indianAnalogy = "Jaise India me Rapido ya Ola bike hoti hai, waise hi Vietnam me 'Xe ôm' (literally: hugging vehicle) hota hai!",
            sections = listOf(
                LessonSection(
                    heading = "1. Driver ko directions aur location batana",
                    contentHinglish = "Gaadi me baith-te waqt useful phrases:",
                    bulletPoints = listOf(
                        "Đến sân bay: Airport chalo",
                        "Đến khách sạn này: Is hotel par le chalo",
                        "Dừng lại ở đây: Yahan rok do",
                        "Đi chậm thôi: Dheere chalao please"
                    ),
                    examplePhrase = "Chú ơi, chở cháu đến sân bay nhé.",
                    exampleMeaning = "Uncle ji, mujhe airport drop kar dijiye."
                ),
                LessonSection(
                    heading = "2. Helmet aur Safety",
                    contentHinglish = "Vietnam me two-wheeler par helmet ('mũ bảo hiểm') pehanna mandatory hai. Driver aapko helmet dega.",
                    bulletPoints = listOf(
                        "Cho tôi mượn mũ bảo hiểm: Mujhe helmet dijiye",
                        "Cảm ơn chú: Thank you uncle"
                    ),
                    examplePhrase = "Dừng lại ở cổng số hai nhé.",
                    exampleMeaning = "Gate number 2 par rok dena please."
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Transport" }.take(5),
            practiceDialogue = listOf(
                DialogueLine("Rohan", "Passenger", "Chú ơi, đi sân bay bao nhiêu tiền?", "Choo' uy, dee sun buy bow nyew tee-en?", "Uncle ji, airport ka kitna loge?"),
                DialogueLine("Driver", "Xe om uncle", "Một trăm năm mươi nghìn cháu nhé.", "Mo't chum num mu-oy ngeen chow' nyeh'.", "150k Dong beta."),
                DialogueLine("Rohan", "Passenger", "Dạ được, chú đi chậm giúp cháu nhé!", "Zaa. du-uk., choo' dee chum. zoop' chow' nyeh'!", "Haan theek hai, thoda dheere chalana please!")
            )
        ),

        Lesson(
            id = 8,
            title = "Health, Doctor & Emergency",
            titleHinglish = "Tabiyat, Dawai aur Emergency",
            subtitle = "Cứu tôi với, Tiệm thuốc aur Dị ứng",
            category = "Safety",
            estimatedMinutes = 10,
            introHinglish = "Safar me agar pet kharab ho jaye, sir dard ho ya emergency ho, toh sahi shabd aana life-saving ho sakta hai.",
            indianAnalogy = "India ki tarah Vietnam me bhi chemist ko prescription dikhaye bina basic dawaiyan mil jati hain.",
            sections = listOf(
                LessonSection(
                    heading = "1. Pharmacy me dawai maangna",
                    contentHinglish = "'Tiệm thuốc' medical store ko bolte hain:",
                    bulletPoints = listOf(
                        "Tôi bị đau bụng: Mere pet me dard ho raha hai",
                        "Tôi bị đau đầu: Mere sir me dard ho raha hai",
                        "Cho tôi thuốc cảm: Mujhe cold/fever ki medicine dijiye"
                    ),
                    examplePhrase = "Tôi bị dị ứng, có thuốc này không?",
                    exampleMeaning = "Mujhe allergy ho gayi hai, kya yeh medicine milegi?"
                ),
                LessonSection(
                    heading = "2. Critical Emergency Phrases",
                    contentHinglish = "Mushkil waqt me zor se bole jane wale shabd:",
                    bulletPoints = listOf(
                        "Cứu tôi với!: Bachao mujhe / Help me!",
                        "Gọi cảnh sát!: Police ko bulao!",
                        "Đưa tôi đến bệnh viện: Mujhe hospital le chalo"
                    ),
                    examplePhrase = "Làm ơn giúp tôi gọi xe cấp cứu!",
                    exampleMeaning = "Please meri ambulance bulane me madad kijiye!"
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Emergency" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Patient", "Sick traveler", "Chị ơi, tôi bị đau bụng và sốt.", "Chee. uy, toy bee. dow boong. vaa shoht'.", "Didi, mere pet me dard aur bukhar hai."),
                DialogueLine("Pharmacist", "Chemist", "Em uống thuốc này hai viên sau khi ăn nhé.", "Em oong' thoo-uk' naay haay vee-en sow khee un nyeh'.", "Yeh dawai khane ke baad do goli lena."),
                DialogueLine("Patient", "Sick traveler", "Dạ, em cảm ơn chị nhiều.", "Zaa., em kaam? un chee. nyew.", "Haanji, bohot shukriya didi.")
            )
        ),

        Lesson(
            id = 9,
            title = "Time, Days & Planning Your Day",
            titleHinglish = "Waqt, Din aur Schedule Banana",
            subtitle = "Mấy giờ, Hôm nay, Ngày mai aur Din ke hisse",
            category = "Daily",
            estimatedMinutes = 10,
            introHinglish = "Tours, train timings aur flight schedule ke liye time poochna aur din samajhna aana zaroori hai.",
            indianAnalogy = "Jaise hum poochte hain 'Bhaiya kitne baje chalna hai?', waise Vietnamese me 'Mấy giờ đi?' bolte hain.",
            sections = listOf(
                LessonSection(
                    heading = "1. Time poochna: Bây giờ mấy giờ?",
                    contentHinglish = "'Bây giờ là mấy giờ?' (Abhi kitne baje hain?):",
                    bulletPoints = listOf(
                        "Giờ: Ghanta / Baje (Hour)",
                        "Phút: Minute",
                        "Ba giờ chiều: Dopahar ke 3 baje",
                        "Tám giờ sáng: Subah ke 8 baje"
                    ),
                    examplePhrase = "Chuyến đi khởi hành lúc mấy giờ?",
                    exampleMeaning = "Trip kitne baje start hogi?"
                ),
                LessonSection(
                    heading = "2. Days & Timeline",
                    contentHinglish = "Aaj, Kal aur Beeta hua kal:",
                    bulletPoints = listOf(
                        "Hôm nay: Aaj (Today)",
                        "Ngày mai: Kal (Tomorrow)",
                        "Hôm qua: Beeta hua kal (Yesterday)",
                        "Buổi sáng: Morning, Buổi chiều: Afternoon, Buổi tối: Evening"
                    ),
                    examplePhrase = "Ngày mai chúng ta đi đâu?",
                    exampleMeaning = "Kal hum log kahan chal rahe hain?"
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Time" }.take(6),
            practiceDialogue = listOf(
                DialogueLine("Deepak", "Tourist", "Em ơi, bây giờ là mấy giờ rồi?", "Em uy, buy zoe laa may' zoe zoy?", "Bhai, abhi kitne baj chuke hain?"),
                DialogueLine("Guide", "Tour Guide", "Dạ, mười giờ rưỡi sáng rồi anh.", "Zaa., mu-oy zoe zu-oy' shaang' zoy aynh.", "Haanji, subah ke 10:30 ho gaye bhaiya."),
                DialogueLine("Deepak", "Tourist", "Ngày mai mấy giờ xe đón?", "Ngaay maay may' zoe seh dawn'?", "Kal bus kitne baje pick karegi?"),
                DialogueLine("Guide", "Tour Guide", "Bảy giờ sáng anh nhé!", "Baay? zoe shaang' aynh nyeh'!", "Subah ke saat (7) baje bhaiya!")
            )
        ),

        Lesson(
            id = 10,
            title = "Making Friends & Cultural Connect",
            titleHinglish = "Dosti karna aur Indian-Vietnamese Connect",
            subtitle = "Ấn Độ, Du lịch, Kết bạn aur Cheers (Một Hai Ba Dzô!)",
            category = "Social",
            estimatedMinutes = 12,
            introHinglish = "Vietnamese log Indians ko bohot warm aur friendly maante hain! Bollywood movies, Indian yoga aur Buddhism ki wajah se dono cultures me bohot gehra connection hai.",
            indianAnalogy = "Jab aap unhe bolenge 'Tôi là người Ấn Độ' (Main Indian hoon), unke chehre par smile aa jayegi aur bolenge 'Ấn Độ rất tuyệt!' (India is great!).",
            sections = listOf(
                LessonSection(
                    heading = "1. Apna parichay dena: Intro in Vietnamese",
                    contentHinglish = "Apne baare me batane ke 3 sentences:",
                    bulletPoints = listOf(
                        "'Tôi tên là [Name]': Mera naam [Name] hai",
                        "'Tôi là người Ấn Độ': Main Bharat (India) se hoon",
                        "'Rất vui được gặp bạn': Aapse milkar bohot khushi hui!"
                    ),
                    examplePhrase = "Tôi tên là Aarav, tôi là người Ấn Độ.",
                    exampleMeaning = "Mera naam Aarav hai, main Indian hoon."
                ),
                LessonSection(
                    heading = "2. Vietnamese Dhabe ka Ritual: 'Một, hai, ba, dzô!'",
                    contentHinglish = "Vietnam ke local food joints me jab log iced tea ya juice ya drink share karte hain, sab ek sath chillakar bolte hain:",
                    bulletPoints = listOf(
                        "Một, hai, ba, dzô! (1, 2, 3, Cheers!)",
                        "Hai, ba, dzô! (2, 3, Cheers!)",
                        "Hai, ba, uống! (2, 3, Piyo!)"
                    ),
                    examplePhrase = "Một, hai, ba, dzô! Chúc bạn sức khỏe!",
                    exampleMeaning = "1, 2, 3, Cheers! Aapki achhi tabiyat ke liye!"
                )
            ),
            keyVocabulary = VocabData.allVocab.filter { it.category == "Connect" },
            practiceDialogue = listOf(
                DialogueLine("Anand", "Indian Guest", "Xin chào! Tôi là Anand, người Ấn Độ.", "Sin chow! Toy laa Anand, ngoo-oy Un' Doh.", "Namaste! Main Anand hoon, India se."),
                DialogueLine("Nam", "Vietnamese Friend", "Ồ chào anh! Tôi rất thích phim Ấn Độ!", "Oh chow aynh! Toy rut' teek' feem Un' Doh!", "Oh hello bhaiya! Mujhe Indian movies bohot pasand hain!"),
                DialogueLine("Anand", "Indian Guest", "Cảm ơn bạn! Việt Nam rất đẹp và thân thiện.", "Kaam? un baan.! Vee-et. Num rut' dep. vaa tun' tee-en.", "Shukriya dost! Vietnam bohot sundar aur friendly hai."),
                DialogueLine("Nam", "Vietnamese Friend", "Một, hai, ba, dzô! Chào mừng đến Việt Nam!", "Mo't, haay, baa, zoh! Chow moong. den' Vee-et. Num!", "1, 2, 3, Cheers! Welcome to Vietnam!")
            )
        )
    )
}
