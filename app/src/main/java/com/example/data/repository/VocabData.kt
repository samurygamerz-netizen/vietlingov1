package com.example.data.repository

import com.example.data.model.Vocabulary

object VocabData {
    val allVocab: List<Vocabulary> = listOf(
        // Category: Greetings & Polite
        Vocabulary(
            id = "v_xin_chao",
            vietnamese = "Xin chào",
            romanPhonetic = "Sin chow",
            hinglishMeaning = "Namaste / Hello",
            indianPhoneticTip = "Sin seedha, chow jaise chowmein ka chow",
            category = "Greetings",
            exampleVietnamese = "Xin chào bạn!",
            exampleHinglish = "Hello dost! / Namaste dost!"
        ),
        Vocabulary(
            id = "v_cam_on",
            vietnamese = "Cảm ơn",
            romanPhonetic = "Kaam? un",
            hinglishMeaning = "Dhanyawad / Shukriya / Thank you",
            indianPhoneticTip = "Kaam pe question mark jaisa dip, un relaxed",
            category = "Greetings",
            exampleVietnamese = "Cảm ơn bạn rất nhiều!",
            exampleHinglish = "Aapka bohot bohot shukriya!"
        ),
        Vocabulary(
            id = "v_xin_loi",
            vietnamese = "Xin lỗi",
            romanPhonetic = "Sin loy~",
            hinglishMeaning = "Maaf kijiye / Sorry / Excuse me",
            indianPhoneticTip = "Loy me gale se halki si hiccup jaisi break lein",
            category = "Greetings",
            exampleVietnamese = "Xin lỗi, tôi không biết.",
            exampleHinglish = "Maaf karna, mujhe nahi pata."
        ),
        Vocabulary(
            id = "v_tam_biet",
            vietnamese = "Tạm biệt",
            romanPhonetic = "Taam. bee-et.",
            hinglishMeaning = "Alvida / Bye bye",
            indianPhoneticTip = "Dono shabd heavy dropping tone me short bole jaate hain",
            category = "Greetings",
            exampleVietnamese = "Tạm biệt, hẹn gặp lại!",
            exampleHinglish = "Alvida, phir milenge!"
        ),
        Vocabulary(
            id = "v_da_vang",
            vietnamese = "Dạ / Vâng",
            romanPhonetic = "Zaa. / Vung",
            hinglishMeaning = "Haanji / Yes (Polite)",
            indianPhoneticTip = "South me 'Yaa', North me 'Zaa'. North me 'Vâng' bhi use hota hai",
            category = "Greetings",
            exampleVietnamese = "Dạ, đúng rồi.",
            exampleHinglish = "Haanji, bilkul sahi hai."
        ),
        Vocabulary(
            id = "v_khong",
            vietnamese = "Không",
            romanPhonetic = "Khawng",
            hinglishMeaning = "Nahi / No / Zero",
            indianPhoneticTip = "Kh gale se deep bolna jaise Urdu me 'Khabar'",
            category = "Greetings",
            exampleVietnamese = "Không, cảm ơn.",
            exampleHinglish = "Nahi, shukriya."
        ),
        Vocabulary(
            id = "v_lam_on",
            vietnamese = "Làm ơn",
            romanPhonetic = "Laam un",
            hinglishMeaning = "Kripya / Please",
            indianPhoneticTip = "Laam falling tone, un seedha flat",
            category = "Greetings",
            exampleVietnamese = "Làm ơn giúp tôi!",
            exampleHinglish = "Please meri madad kijiye!"
        ),
        Vocabulary(
            id = "v_khoe_khong",
            vietnamese = "Khỏe không?",
            romanPhonetic = "Khweh? khawng?",
            hinglishMeaning = "Aap kaise hain? / Sab theek?",
            indianPhoneticTip = "Khweh pe question mark dip, khawng flat",
            category = "Greetings",
            exampleVietnamese = "Bạn có khỏe không?",
            exampleHinglish = "Kya aap theek hain? / How are you?"
        ),
        Vocabulary(
            id = "v_khoe",
            vietnamese = "Khỏe",
            romanPhonetic = "Khweh?",
            hinglishMeaning = "Main theek hoon / Healthy",
            indianPhoneticTip = "Khweh dipping tone",
            category = "Greetings",
            exampleVietnamese = "Tôi khỏe, cảm ơn.",
            exampleHinglish = "Main badhiya hoon, shukriya."
        ),
        Vocabulary(
            id = "v_hen_gap_lai",
            vietnamese = "Hẹn gặp lại",
            romanPhonetic = "Hen. gaap. laay.",
            hinglishMeaning = "Phir milenge / See you again",
            indianPhoneticTip = "Teeno words me underdot heavy drop tone hai",
            category = "Greetings",
            exampleVietnamese = "Ngày mai hẹn gặp lại!",
            exampleHinglish = "Kal phir milenge!"
        ),
        Vocabulary(
            id = "v_chuc_ngu_ngon",
            vietnamese = "Chúc ngủ ngon",
            romanPhonetic = "Chook' ngoo? ngawn",
            hinglishMeaning = "Shubh raatri / Good night",
            indianPhoneticTip = "Chook rising, ngoo dipping",
            category = "Greetings",
            exampleVietnamese = "Chúc bạn ngủ ngon!",
            exampleHinglish = "Aapko shubh raatri!"
        ),
        Vocabulary(
            id = "v_chuc_mung",
            vietnamese = "Chúc mừng",
            romanPhonetic = "Chook' moong",
            hinglishMeaning = "Badhaai ho / Congratulations",
            indianPhoneticTip = "Chook sharp high, moong falling",
            category = "Greetings",
            exampleVietnamese = "Chúc mừng năm mới!",
            exampleHinglish = "Naye saal ki badhaai! (Happy New Year)"
        ),

        // Category: Pronouns & People
        Vocabulary(
            id = "v_toi",
            vietnamese = "Tôi",
            romanPhonetic = "Toy",
            hinglishMeaning = "Main / I (Formal)",
            indianPhoneticTip = "Seedha 'Toy' bole bina kisi tone change ke",
            category = "Pronouns",
            exampleVietnamese = "Tôi là người Ấn Độ.",
            exampleHinglish = "Main Indian hoon."
        ),
        Vocabulary(
            id = "v_ban",
            vietnamese = "Bạn",
            romanPhonetic = "Baan.",
            hinglishMeaning = "Aap / Tum / Dost (Equal age)",
            indianPhoneticTip = "Baan heavy drop tone, abruptly finish kijiye",
            category = "Pronouns",
            exampleVietnamese = "Bạn tên là gì?",
            exampleHinglish = "Aapka naam kya hai?"
        ),
        Vocabulary(
            id = "v_anh",
            vietnamese = "Anh",
            romanPhonetic = "Aynh",
            hinglishMeaning = "Bhaiya / Thoda bada ladka / You (male)",
            indianPhoneticTip = "Jaise Hindi me 'Bhaiya' bolte hain respect se",
            category = "Pronouns",
            exampleVietnamese = "Chào anh!",
            exampleHinglish = "Namaste bhaiya!"
        ),
        Vocabulary(
            id = "v_chi",
            vietnamese = "Chị",
            romanPhonetic = "Chee.",
            hinglishMeaning = "Didi / Thodi badi ladki / You (female)",
            indianPhoneticTip = "Chee heavy drop underdot, respect ke sath",
            category = "Pronouns",
            exampleVietnamese = "Chị ơi, cho em hỏi.",
            exampleHinglish = "Didi ji, suniye ek sawaal poochna hai."
        ),
        Vocabulary(
            id = "v_em",
            vietnamese = "Em",
            romanPhonetic = "Em",
            hinglishMeaning = "Chhota bhai/behen ya junior",
            indianPhoneticTip = "Flat 'Em', jaise English letter M",
            category = "Pronouns",
            exampleVietnamese = "Em cảm ơn anh!",
            exampleHinglish = "Thank you bhaiya! (from younger to older)"
        ),
        Vocabulary(
            id = "v_bac",
            vietnamese = "Bác",
            romanPhonetic = "Baak'",
            hinglishMeaning = "Tauji / Badi umar ke buzurg (Uncle/Aunt)",
            indianPhoneticTip = "Rising tone with stopped K",
            category = "Pronouns",
            exampleVietnamese = "Cháu chào bác ạ!",
            exampleHinglish = "Tauji namaste!"
        ),
        Vocabulary(
            id = "v_chu",
            vietnamese = "Chú",
            romanPhonetic = "Choo'",
            hinglishMeaning = "Chachaji / Papa se chhote uncle",
            indianPhoneticTip = "Choo rising sharp tone",
            category = "Pronouns",
            exampleVietnamese = "Chú ơi, bao nhiêu tiền?",
            exampleHinglish = "Uncle ji, kitne paise huye?"
        ),
        Vocabulary(
            id = "v_co",
            vietnamese = "Cô",
            romanPhonetic = "Koh",
            hinglishMeaning = "Aunty / Teacher / Lady",
            indianPhoneticTip = "Koh flat tone, respectful",
            category = "Pronouns",
            exampleVietnamese = "Cô ơi, có phở chay không?",
            exampleHinglish = "Aunty ji, kya veg phở milega?"
        ),
        Vocabulary(
            id = "v_chung_toi",
            vietnamese = "Chúng tôi",
            romanPhonetic = "Choong' toy",
            hinglishMeaning = "Hum log / We",
            indianPhoneticTip = "Choong rising, toy flat",
            category = "Pronouns",
            exampleVietnamese = "Chúng tôi là du khách.",
            exampleHinglish = "Hum log tourists hain."
        ),
        Vocabulary(
            id = "v_ho",
            vietnamese = "Họ",
            romanPhonetic = "Haw.",
            hinglishMeaning = "Woh log / They",
            indianPhoneticTip = "Haw heavy drop tone",
            category = "Pronouns",
            exampleVietnamese = "Họ là ai?",
            exampleHinglish = "Woh log kaun hain?"
        ),

        // Category: Food, Drinks & Vegetarian (Super important for Indian learners!)
        Vocabulary(
            id = "v_an_chay",
            vietnamese = "Ăn chay",
            romanPhonetic = "Un chai",
            hinglishMeaning = "Shakahari / Pure Veg khana",
            indianPhoneticTip = "Un chai: Indian travelers ke liye sabse zaroori word!",
            category = "Food",
            exampleVietnamese = "Tôi ăn chay, không ăn thịt.",
            exampleHinglish = "Main shakahari hoon, meat nahi khata."
        ),
        Vocabulary(
            id = "v_khong_thit",
            vietnamese = "Không thịt",
            romanPhonetic = "Khawng teet.",
            hinglishMeaning = "Bina meat ke / No meat",
            indianPhoneticTip = "Teet heavy drop with T stopped",
            category = "Food",
            exampleVietnamese = "Làm ơn cho món không thịt.",
            exampleHinglish = "Kripya bina meat wali dish dijiye."
        ),
        Vocabulary(
            id = "v_khong_nuoc_mam",
            vietnamese = "Không nước mắm",
            romanPhonetic = "Khawng nu-uk' maam'",
            hinglishMeaning = "Fish sauce mat daalna!",
            indianPhoneticTip = "Vietnam me har jagah fish sauce dalta hai, ye bolna yaad rakhein",
            category = "Food",
            exampleVietnamese = "Tôi ăn chay, không nước mắm nhé!",
            exampleHinglish = "Main veg hoon, fish sauce bilkul mat daalna please!"
        ),
        Vocabulary(
            id = "v_pho",
            vietnamese = "Phở",
            romanPhonetic = "Fuh?",
            hinglishMeaning = "Vietnamese Rice Noodle Soup",
            indianPhoneticTip = "'Po' nahi bolna, 'Fuh' with question mark pitch bolo!",
            category = "Food",
            exampleVietnamese = "Cho tôi một tô phở chay.",
            exampleHinglish = "Mujhe ek bowl veg phở dijiye."
        ),
        Vocabulary(
            id = "v_banh_mi",
            vietnamese = "Bánh mì",
            romanPhonetic = "Baan' mee",
            hinglishMeaning = "Vietnamese Baguette Sandwich",
            indianPhoneticTip = "Baan rising, mee falling",
            category = "Food",
            exampleVietnamese = "Bánh mì này rất ngon!",
            exampleHinglish = "Yeh sandwich bohot lazeez hai!"
        ),
        Vocabulary(
            id = "v_ca_phe_sua_da",
            vietnamese = "Cà phê sữa đá",
            romanPhonetic = "Kaa fey suu~ah daa'",
            hinglishMeaning = "Iced milk coffee (Famous Vietnamese condensed milk coffee)",
            indianPhoneticTip = "Kaa falling, fey flat, suu~ah glottal, daa rising",
            category = "Food",
            exampleVietnamese = "Cho một ly cà phê sữa đá!",
            exampleHinglish = "Ek glass cold milk coffee dena!"
        ),
        Vocabulary(
            id = "v_ca_phe_den",
            vietnamese = "Cà phê đen",
            romanPhonetic = "Kaa fey den",
            hinglishMeaning = "Black coffee",
            indianPhoneticTip = "Den flat mid tone",
            category = "Food",
            exampleVietnamese = "Tôi thích cà phê đen.",
            exampleHinglish = "Mujhe black coffee pasand hai."
        ),
        Vocabulary(
            id = "v_tra",
            vietnamese = "Trà",
            romanPhonetic = "Chaa / Traa",
            hinglishMeaning = "Chai / Tea",
            indianPhoneticTip = "Jaise Hindi me 'Chai' bolte hain, waisa hi!",
            category = "Food",
            exampleVietnamese = "Trà đá miễn phí.",
            exampleHinglish = "Iced tea free hai."
        ),
        Vocabulary(
            id = "v_tra_da",
            vietnamese = "Trà đá",
            romanPhonetic = "Chaa daa'",
            hinglishMeaning = "Iced Green Tea (served everywhere in Vietnam)",
            indianPhoneticTip = "Chaa falling, daa sharp rising",
            category = "Food",
            exampleVietnamese = "Cho hai ly trà đá nhé.",
            exampleHinglish = "Do glass iced tea laao ji."
        ),
        Vocabulary(
            id = "v_nuoc_suoi",
            vietnamese = "Nước suối",
            romanPhonetic = "Nu-uk' suoy'",
            hinglishMeaning = "Mineral / Bottled Water",
            indianPhoneticTip = "Dono words rising sắc tone hain",
            category = "Food",
            exampleVietnamese = "Một chai nước suối bao nhiêu?",
            exampleHinglish = "Ek bottle paani kitne ka hai?"
        ),
        Vocabulary(
            id = "v_com",
            vietnamese = "Cơm",
            romanPhonetic = "Kuhm",
            hinglishMeaning = "Paka hua Chawal / Rice",
            indianPhoneticTip = "Kuhm flat tone",
            category = "Food",
            exampleVietnamese = "Cơm chiên chay rất ngon.",
            exampleHinglish = "Veg fried rice bohot accha hai."
        ),
        Vocabulary(
            id = "v_rau",
            vietnamese = "Rau",
            romanPhonetic = "Zow / Row",
            hinglishMeaning = "Sabziyan / Vegetables",
            indianPhoneticTip = "North me Zow, South me Row",
            category = "Food",
            exampleVietnamese = "Tôi muốn nhiều rau.",
            exampleHinglish = "Mujhe zyaada sabziyan chahiye."
        ),
        Vocabulary(
            id = "v_dau_phu",
            vietnamese = "Đậu phụ / Đậu hũ",
            romanPhonetic = "Dow. foo. / Dow. hoo~",
            hinglishMeaning = "Tofu / Paneer jaisa soy paneer",
            indianPhoneticTip = "Indian vegetarians ke liye best protein source in Vietnam",
            category = "Food",
            exampleVietnamese = "Món đậu hũ này ngon quá!",
            exampleHinglish = "Yeh tofu dish lajawab hai!"
        ),
        Vocabulary(
            id = "v_hoa_qua",
            vietnamese = "Hoa quả / Trái cây",
            romanPhonetic = "Hwah kwah? / Traay' kay",
            hinglishMeaning = "Phal / Fruits",
            indianPhoneticTip = "North me hoa quả, South me trái cây",
            category = "Food",
            exampleVietnamese = "Chợ này bán nhiều hoa quả.",
            exampleHinglish = "Is market me bohot taaza fruits bikte hain."
        ),
        Vocabulary(
            id = "v_tinh_tien",
            vietnamese = "Tính tiền / Thanh toán",
            romanPhonetic = "Tin' tee-en / Tahn twaan'",
            hinglishMeaning = "Bill dijiye / Check please",
            indianPhoneticTip = "Khana khane ke baad waiter ko bolne ke liye",
            category = "Food",
            exampleVietnamese = "Em ơi, tính tiền giúp anh!",
            exampleHinglish = "Bhaiya, bill le aao please!"
        ),
        Vocabulary(
            id = "v_ngon",
            vietnamese = "Ngon",
            romanPhonetic = "Ngawn",
            hinglishMeaning = "Swadisht / Bohot tasty!",
            indianPhoneticTip = "Ng sound nasal hai, jaise 'Singing' ka ng",
            category = "Food",
            exampleVietnamese = "Món này ngon quá!",
            exampleHinglish = "Yeh dish bohot lazeez hai!"
        ),

        // Category: Numbers & Money
        Vocabulary(
            id = "v_mot",
            vietnamese = "Một",
            romanPhonetic = "Mo't.",
            hinglishMeaning = "Ek / 1",
            indianPhoneticTip = "O ke sath heavy drop cut-off",
            category = "Numbers",
            exampleVietnamese = "Một ly cà phê.",
            exampleHinglish = "Ek cup coffee."
        ),
        Vocabulary(
            id = "v_hai",
            vietnamese = "Hai",
            romanPhonetic = "Haay",
            hinglishMeaning = "Do / 2",
            indianPhoneticTip = "Simple flat 'Haay'",
            category = "Numbers",
            exampleVietnamese = "Hai người.",
            exampleHinglish = "Do log / Two people."
        ),
        Vocabulary(
            id = "v_ba",
            vietnamese = "Ba",
            romanPhonetic = "Baa",
            hinglishMeaning = "Teen / 3",
            indianPhoneticTip = "Flat 'Baa'",
            category = "Numbers",
            exampleVietnamese = "Ba nghìn đồng.",
            exampleHinglish = "Teen hazaar Dong."
        ),
        Vocabulary(
            id = "v_bon",
            vietnamese = "Bốn",
            romanPhonetic = "Bohn'",
            hinglishMeaning = "Chaar / 4",
            indianPhoneticTip = "Rising sharp tone",
            category = "Numbers",
            exampleVietnamese = "Bốn cái bánh mì.",
            exampleHinglish = "Chaar bánh mì sandwich."
        ),
        Vocabulary(
            id = "v_nam",
            vietnamese = "Năm",
            romanPhonetic = "Num",
            hinglishMeaning = "Paanch / 5 ya Saal (Year)",
            indianPhoneticTip = "Num flat tone",
            category = "Numbers",
            exampleVietnamese = "Năm mươi nghìn.",
            exampleHinglish = "Pachaas hazaar (50k VND ~ 170 INR)."
        ),
        Vocabulary(
            id = "v_sau",
            vietnamese = "Sáu",
            romanPhonetic = "Show'",
            hinglishMeaning = "Chheh / 6",
            indianPhoneticTip = "Rising tone",
            category = "Numbers",
            exampleVietnamese = "Sáu giờ rồi.",
            exampleHinglish = "Chheh baj gaye."
        ),
        Vocabulary(
            id = "v_bay",
            vietnamese = "Bảy",
            romanPhonetic = "Baay?",
            hinglishMeaning = "Saat / 7",
            indianPhoneticTip = "Dipping tone with hook",
            category = "Numbers",
            exampleVietnamese = "Thứ Bảy.",
            exampleHinglish = "Shanivaar / Saturday."
        ),
        Vocabulary(
            id = "v_tam",
            vietnamese = "Tám",
            romanPhonetic = "Taam'",
            hinglishMeaning = "Aath / 8",
            indianPhoneticTip = "Sharp rising tone",
            category = "Numbers",
            exampleVietnamese = "Tám mươi nghìn.",
            exampleHinglish = "Assi hazaar (80,000 VND)."
        ),
        Vocabulary(
            id = "v_chin",
            vietnamese = "Chín",
            romanPhonetic = "Cheen'",
            hinglishMeaning = "Nau / 9 ya Paka hua (Cooked)",
            indianPhoneticTip = "Rising sharp pitch",
            category = "Numbers",
            exampleVietnamese = "Chín giờ sáng.",
            exampleHinglish = "Subah ke 9 baje."
        ),
        Vocabulary(
            id = "v_muoi",
            vietnamese = "Mười",
            romanPhonetic = "Mu-oy",
            hinglishMeaning = "Das / 10",
            indianPhoneticTip = "Falling low tone",
            category = "Numbers",
            exampleVietnamese = "Mười phút nữa.",
            exampleHinglish = "Das minute aur."
        ),
        Vocabulary(
            id = "v_tram",
            vietnamese = "Trăm",
            romanPhonetic = "Chum / Trum",
            hinglishMeaning = "Sau / 100 (Hundred)",
            indianPhoneticTip = "Một trăm = Sau (100)",
            category = "Numbers",
            exampleVietnamese = "Một trăm nghìn.",
            exampleHinglish = "Ek lakh Dong (100,000 VND ~ 340 INR)."
        ),
        Vocabulary(
            id = "v_nghin",
            vietnamese = "Nghìn / Ngàn",
            romanPhonetic = "Ngeen / Ngaan",
            hinglishMeaning = "Hazaar / 1,000",
            indianPhoneticTip = "North me Nghìn, South me Ngàn",
            category = "Numbers",
            exampleVietnamese = "Hai mươi nghìn đồng.",
            exampleHinglish = "Bees hazaar Dong (20,000 VND)."
        ),
        Vocabulary(
            id = "v_trieu",
            vietnamese = "Triệu",
            romanPhonetic = "Chee-ew. / Tree-ew.",
            hinglishMeaning = "Das Lakh / 1 Million",
            indianPhoneticTip = "1 Triệu Dong lagbhag 3,400 Indian Rupee hota hai",
            category = "Numbers",
            exampleVietnamese = "Một triệu đồng.",
            exampleHinglish = "Ek million VND (10 Lakh Dong)."
        ),
        Vocabulary(
            id = "v_tien",
            vietnamese = "Tiền",
            romanPhonetic = "Tee-en",
            hinglishMeaning = "Paise / Currency",
            indianPhoneticTip = "Falling tone",
            category = "Numbers",
            exampleVietnamese = "Tôi không có tiền mặt.",
            exampleHinglish = "Mere paas cash paise nahi hain."
        ),
        Vocabulary(
            id = "v_doi_tien",
            vietnamese = "Đổi tiền",
            romanPhonetic = "Doy? tee-en",
            hinglishMeaning = "Currency exchange karna",
            indianPhoneticTip = "Doy dipping, tee-en falling",
            category = "Numbers",
            exampleVietnamese = "Ở đâu đổi tiền tốt nhất?",
            exampleHinglish = "Best currency exchange kahan hai?"
        ),

        // Category: Shopping & Bargaining
        Vocabulary(
            id = "v_bao_nhieu",
            vietnamese = "Bao nhiêu?",
            romanPhonetic = "Bow nyew",
            hinglishMeaning = "Kitna / How much?",
            indianPhoneticTip = "Bow nyew flat tones",
            category = "Shopping",
            exampleVietnamese = "Cái này bao nhiêu tiền?",
            exampleHinglish = "Yeh kitne paise ka hai?"
        ),
        Vocabulary(
            id = "v_dat_qua",
            vietnamese = "Đắt quá!",
            romanPhonetic = "Dut' kwah'!",
            hinglishMeaning = "Bohot mehenga hai! (Too expensive!)",
            indianPhoneticTip = "Dono words rising high pitch me bolkar surprise show karein",
            category = "Shopping",
            exampleVietnamese = "Đắt quá, bớt đi!",
            exampleHinglish = "Bohot mehenga hai bhaiya, thoda kam karo!"
        ),
        Vocabulary(
            id = "v_bot_duoc_khong",
            vietnamese = "Bớt được không?",
            romanPhonetic = "Buht' du-uk. khawng?",
            hinglishMeaning = "Discount milega kya? / Thoda kam hoga?",
            indianPhoneticTip = "Bargaining ka Brahmastra line!",
            category = "Shopping",
            exampleVietnamese = "Bớt được không chị?",
            exampleHinglish = "Didi ji, thoda discount doge kya?"
        ),
        Vocabulary(
            id = "v_re",
            vietnamese = "Rẻ",
            romanPhonetic = "Ze? / Re?",
            hinglishMeaning = "Sasta / Cheap",
            indianPhoneticTip = "Dipping tone",
            category = "Shopping",
            exampleVietnamese = "Cái này rẻ hơn.",
            exampleHinglish = "Yeh wala zyada sasta hai."
        ),
        Vocabulary(
            id = "v_mua",
            vietnamese = "Mua",
            romanPhonetic = "Moo-ah",
            hinglishMeaning = "Kharidna / To buy",
            indianPhoneticTip = "Flat tone",
            category = "Shopping",
            exampleVietnamese = "Tôi muốn mua cái này.",
            exampleHinglish = "Main yeh kharidna chahta hoon."
        ),
        Vocabulary(
            id = "v_ban",
            vietnamese = "Bán",
            romanPhonetic = "Baan'",
            hinglishMeaning = "Bechna / To sell",
            indianPhoneticTip = "Rising sharp tone",
            category = "Shopping",
            exampleVietnamese = "Ở đây có bán nón lá không?",
            exampleHinglish = "Kya yahan conical hat bechte hain?"
        ),
        Vocabulary(
            id = "v_mau_sac",
            vietnamese = "Màu sắc",
            romanPhonetic = "Mow suk'",
            hinglishMeaning = "Rang / Color",
            indianPhoneticTip = "Mow falling, suk rising",
            category = "Shopping",
            exampleVietnamese = "Có màu khác không?",
            exampleHinglish = "Koi doosra color hai kya?"
        ),
        Vocabulary(
            id = "v_cai_nay",
            vietnamese = "Cái này",
            romanPhonetic = "Kaay' naay",
            hinglishMeaning = "Yeh wala / This one",
            indianPhoneticTip = "Dukaan par ungli dikha kar bolne ke liye",
            category = "Shopping",
            exampleVietnamese = "Cho tôi xem cái này.",
            exampleHinglish = "Mujhe yeh wala dikhaiye."
        ),
        Vocabulary(
            id = "v_cai_kia",
            vietnamese = "Cái kia",
            romanPhonetic = "Kaay' kee-ah",
            hinglishMeaning = "Woh wala / That one over there",
            indianPhoneticTip = "Kee-ah flat tone",
            category = "Shopping",
            exampleVietnamese = "Cái kia đẹp quá!",
            exampleHinglish = "Woh wala kitna sundar hai!"
        ),
        Vocabulary(
            id = "v_hoa_don",
            vietnamese = "Hóa đơn",
            romanPhonetic = "Hwah' duhn",
            hinglishMeaning = "Bill / Receipt",
            indianPhoneticTip = "Hwah rising, duhn flat",
            category = "Shopping",
            exampleVietnamese = "Làm ơn cho tôi hóa đơn.",
            exampleHinglish = "Kripya mujhe bill/receipt dijiye."
        ),

        // Category: Directions & Places
        Vocabulary(
            id = "v_o_dau",
            vietnamese = "Ở đâu?",
            romanPhonetic = "Uh? dow",
            hinglishMeaning = "Kahan hai? / Where?",
            indianPhoneticTip = "Uh dipping tone, dow flat",
            category = "Directions",
            exampleVietnamese = "Nhà vệ sinh ở đâu?",
            exampleHinglish = "Washroom / Toilet kahan hai?"
        ),
        Vocabulary(
            id = "v_nha_ve_sinh",
            vietnamese = "Nhà vệ sinh",
            romanPhonetic = "Nyah vey. sin",
            hinglishMeaning = "Toilet / Washroom / Restroom",
            indianPhoneticTip = "Har traveler ke liye jeevan-rakshak phrase!",
            category = "Directions",
            exampleVietnamese = "Xin lỗi, nhà vệ sinh ở đâu ạ?",
            exampleHinglish = "Excuse me, washroom kahan hai ji?"
        ),
        Vocabulary(
            id = "v_di_thang",
            vietnamese = "Đi thẳng",
            romanPhonetic = "Dee thung?",
            hinglishMeaning = "Seedhe jao / Go straight",
            indianPhoneticTip = "Thung me dipping tone hook hai",
            category = "Directions",
            exampleVietnamese = "Đi thẳng rồi rẽ trái.",
            exampleHinglish = "Seedhe jao phir left mudo."
        ),
        Vocabulary(
            id = "v_re_trai",
            vietnamese = "Rẽ trái",
            romanPhonetic = "Ze~ traay' / Re~ traay'",
            hinglishMeaning = "Left mudo / Turn left",
            indianPhoneticTip = "Traay sharp rising",
            category = "Directions",
            exampleVietnamese = "Đến ngã tư rẽ trái.",
            exampleHinglish = "Chauraha aane par left mudna."
        ),
        Vocabulary(
            id = "v_re_phai",
            vietnamese = "Rẽ phải",
            romanPhonetic = "Ze~ faay? / Re~ faay?",
            hinglishMeaning = "Right mudo / Turn right",
            indianPhoneticTip = "Faay dipping tone",
            category = "Directions",
            exampleVietnamese = "Rẽ phải ở đây.",
            exampleHinglish = "Yahan se right mudo."
        ),
        Vocabulary(
            id = "v_dung_lai",
            vietnamese = "Dừng lại",
            romanPhonetic = "Zoong laay. / Yoong laay.",
            hinglishMeaning = "Ruk jao / Roko / Stop here",
            indianPhoneticTip = "Taxi ya bike driver ko bolne ke liye",
            category = "Directions",
            exampleVietnamese = "Dừng lại ở đây làm ơn!",
            exampleHinglish = "Yahan rok dijiye please!"
        ),
        Vocabulary(
            id = "v_khach_san",
            vietnamese = "Khách sạn",
            romanPhonetic = "Khuk' saan.",
            hinglishMeaning = "Hotel",
            indianPhoneticTip = "Khuk rising, saan heavy drop",
            category = "Directions",
            exampleVietnamese = "Khách sạn của tôi ở gần đây.",
            exampleHinglish = "Mera hotel paas me hi hai."
        ),
        Vocabulary(
            id = "v_san_bay",
            vietnamese = "Sân bay",
            romanPhonetic = "Sun buy",
            hinglishMeaning = "Airport",
            indianPhoneticTip = "Dono flat tones",
            category = "Directions",
            exampleVietnamese = "Đi sân bay bao nhiêu tiền?",
            exampleHinglish = "Airport jane ka kitna lagega?"
        ),
        Vocabulary(
            id = "v_benh_vien",
            vietnamese = "Bệnh viện",
            romanPhonetic = "Ben. vee-en.",
            hinglishMeaning = "Hospital",
            indianPhoneticTip = "Dono heavy underdot sounds",
            category = "Directions",
            exampleVietnamese = "Làm ơn đưa tôi đến bệnh viện!",
            exampleHinglish = "Please mujhe hospital le chalo!"
        ),
        Vocabulary(
            id = "v_cho",
            vietnamese = "Chợ",
            romanPhonetic = "Chuh.",
            hinglishMeaning = "Market / Bazaar",
            indianPhoneticTip = "Chuh heavy drop",
            category = "Directions",
            exampleVietnamese = "Chợ Bến Thành rất nổi tiếng.",
            exampleHinglish = "Ben Thanh Market bohot famous hai."
        ),

        // Category: Transport & Travel
        Vocabulary(
            id = "v_xe_om",
            vietnamese = "Xe ôm",
            romanPhonetic = "Seh ohm",
            hinglishMeaning = "Motorbike Taxi (Vietnam's rapido!)",
            indianPhoneticTip = "Seh flat, ohm flat. Vietnam ka traditional two-wheeler taxi",
            category = "Transport",
            exampleVietnamese = "Tôi muốn đi xe ôm.",
            exampleHinglish = "Main bike taxi se jana chahta hoon."
        ),
        Vocabulary(
            id = "v_taxi",
            vietnamese = "Xe taxi",
            romanPhonetic = "Seh tak-si",
            hinglishMeaning = "Taxi / Cab",
            indianPhoneticTip = "Simple English loan word",
            category = "Transport",
            exampleVietnamese = "Gọi một chiếc taxi giúp tôi.",
            exampleHinglish = "Mere liye ek taxi bula dijiye."
        ),
        Vocabulary(
            id = "v_xe_buyt",
            vietnamese = "Xe buýt",
            romanPhonetic = "Seh bweet'",
            hinglishMeaning = "Public Bus",
            indianPhoneticTip = "Bweet rising pitch",
            category = "Transport",
            exampleVietnamese = "Trạm xe buýt ở đâu?",
            exampleHinglish = "Bus stand kahan hai?"
        ),
        Vocabulary(
            id = "v_ve",
            vietnamese = "Vé",
            romanPhonetic = "Veh'",
            hinglishMeaning = "Ticket",
            indianPhoneticTip = "Veh rising sharp",
            category = "Transport",
            exampleVietnamese = "Một vé bao nhiêu tiền?",
            exampleHinglish = "Ek ticket kitne ka hai?"
        ),
        Vocabulary(
            id = "v_ga_tau",
            vietnamese = "Ga tàu",
            romanPhonetic = "Gah tow",
            hinglishMeaning = "Railway station",
            indianPhoneticTip = "Tow falling tone",
            category = "Transport",
            exampleVietnamese = "Đường đến ga tàu ở đâu?",
            exampleHinglish = "Railway station ka rasta kahan hai?"
        ),

        // Category: Emergency & Health
        Vocabulary(
            id = "v_cuu_toi",
            vietnamese = "Cứu tôi với!",
            romanPhonetic = "Kew' toy vuh-y'!",
            hinglishMeaning = "Bachao! / Help me!",
            indianPhoneticTip = "Emergency situation me bolne ke liye loud & clear",
            category = "Emergency",
            exampleVietnamese = "Làm ơn, cứu tôi với!",
            exampleHinglish = "Please, koi meri madad karo/bachao!"
        ),
        Vocabulary(
            id = "v_canh_sat",
            vietnamese = "Cảnh sát / Công an",
            romanPhonetic = "Kanh? saat' / Kawng un",
            hinglishMeaning = "Police",
            indianPhoneticTip = "North me Công an zyada common hai",
            category = "Emergency",
            exampleVietnamese = "Gọi cảnh sát ngay!",
            exampleHinglish = "Turant police ko phone karo!"
        ),
        Vocabulary(
            id = "v_tiem_thuoc",
            vietnamese = "Tiệm thuốc",
            romanPhonetic = "Tee-em. thoo-uk'",
            hinglishMeaning = "Medical store / Pharmacy",
            indianPhoneticTip = "Dawai ki dukaan dhoondhne ke liye",
            category = "Emergency",
            exampleVietnamese = "Gần đây có tiệm thuốc không?",
            exampleHinglish = "Kya paas me koi medical store hai?"
        ),
        Vocabulary(
            id = "v_dau_bung",
            vietnamese = "Đau bụng",
            romanPhonetic = "Dow boong.",
            hinglishMeaning = "Pet dard / Stomach ache",
            indianPhoneticTip = "Street food se pet kharab hone par use karein",
            category = "Emergency",
            exampleVietnamese = "Tôi bị đau bụng.",
            exampleHinglish = "Mere pet me dard ho raha hai."
        ),
        Vocabulary(
            id = "v_dau_dau",
            vietnamese = "Đau đầu",
            romanPhonetic = "Dow dow",
            hinglishMeaning = "Sir dard / Headache",
            indianPhoneticTip = "Dono words flat",
            category = "Emergency",
            exampleVietnamese = "Tôi bị đau đầu, cần thuốc.",
            exampleHinglish = "Mujhe headache hai, medicine chahiye."
        ),
        Vocabulary(
            id = "v_di_ung",
            vietnamese = "Dị ứng",
            romanPhonetic = "Zee. oong' / Yee. oong'",
            hinglishMeaning = "Allergy",
            indianPhoneticTip = "Food allergy explain karne ke liye",
            category = "Emergency",
            exampleVietnamese = "Tôi bị dị ứng hải sản.",
            exampleHinglish = "Mujhe seafood se allergy hai."
        ),
        Vocabulary(
            id = "v_lac_duong",
            vietnamese = "Lạc đường",
            romanPhonetic = "Laak. du-ung",
            hinglishMeaning = "Rasta bhatak jana / Lost",
            indianPhoneticTip = "Laak heavy drop",
            category = "Emergency",
            exampleVietnamese = "Tôi bị lạc đường rồi.",
            exampleHinglish = "Main rasta bhatak gaya hoon."
        ),

        // Category: Time & Calendar
        Vocabulary(
            id = "v_may_gio",
            vietnamese = "Mấy giờ?",
            romanPhonetic = "May' zoe? / May' yoe?",
            hinglishMeaning = "Kitne baje hain? / What time?",
            indianPhoneticTip = "May rising, zoe dipping",
            category = "Time",
            exampleVietnamese = "Bây giờ là mấy giờ?",
            exampleHinglish = "Abhi kitne baj rahe hain?"
        ),
        Vocabulary(
            id = "v_hom_nay",
            vietnamese = "Hôm nay",
            romanPhonetic = "Hohm naay",
            hinglishMeaning = "Aaj / Today",
            indianPhoneticTip = "Dono flat seedhe sounds",
            category = "Time",
            exampleVietnamese = "Hôm nay trời rất đẹp.",
            exampleHinglish = "Aaj mausam bohot accha hai."
        ),
        Vocabulary(
            id = "v_ngay_mai",
            vietnamese = "Ngày mai",
            romanPhonetic = "Ngaay maay",
            hinglishMeaning = "Kal (Aane wala) / Tomorrow",
            indianPhoneticTip = "Ngaay falling, maay flat",
            category = "Time",
            exampleVietnamese = "Ngày mai tôi đi Hà Nội.",
            exampleHinglish = "Kal main Hanoi jaunga."
        ),
        Vocabulary(
            id = "v_hom_qua",
            vietnamese = "Hôm qua",
            romanPhonetic = "Hohm kwah",
            hinglishMeaning = "Kal (Beeta hua) / Yesterday",
            indianPhoneticTip = "Dono flat tones",
            category = "Time",
            exampleVietnamese = "Hôm qua tôi đến Việt Nam.",
            exampleHinglish = "Kal main Vietnam pahuncha tha."
        ),
        Vocabulary(
            id = "v_buoi_sang",
            vietnamese = "Buổi sáng",
            romanPhonetic = "Buoy? shaang'",
            hinglishMeaning = "Subah / Morning",
            indianPhoneticTip = "Buoy dipping, shaang rising",
            category = "Time",
            exampleVietnamese = "Chào buổi sáng!",
            exampleHinglish = "Shubh prabhat! / Good morning!"
        ),
        Vocabulary(
            id = "v_buoi_toi",
            vietnamese = "Buổi tối",
            romanPhonetic = "Buoy? toy'",
            hinglishMeaning = "Shaam ya Raat / Evening",
            indianPhoneticTip = "Toy rising sharp",
            category = "Time",
            exampleVietnamese = "Buổi tối đi chợ đêm.",
            exampleHinglish = "Shaam ko night market chalte hain."
        ),

        // Category: Indian-Vietnamese Connect & Social
        Vocabulary(
            id = "v_an_do",
            vietnamese = "Ấn Độ",
            romanPhonetic = "Un' Doh.",
            hinglishMeaning = "Bharat / India",
            indianPhoneticTip = "Un rising sharp, Doh heavy drop",
            category = "Connect",
            exampleVietnamese = "Tôi là người Ấn Độ.",
            exampleHinglish = "Main Bharat (India) ka nagrik hoon."
        ),
        Vocabulary(
            id = "v_du_lich",
            vietnamese = "Du lịch",
            romanPhonetic = "Zoo leek. / Yoo leek.",
            hinglishMeaning = "Ghoomna / Travel / Tourism",
            indianPhoneticTip = "Zoo flat, leek heavy drop",
            category = "Connect",
            exampleVietnamese = "Tôi đi du lịch Việt Nam.",
            exampleHinglish = "Main Vietnam ghoomne aaya hoon."
        ),
        Vocabulary(
            id = "v_rat_vui",
            vietnamese = "Rất vui được gặp bạn",
            romanPhonetic = "Rut' vooy du-uk. gaap. baan.",
            hinglishMeaning = "Aapse milkar bohot khushi hui!",
            indianPhoneticTip = "Indian 'Aapse milkar accha laga' ka exact counterpart",
            category = "Connect",
            exampleVietnamese = "Xin chào, rất vui được gặp bạn!",
            exampleHinglish = "Namaste, aapse milkar bohot khushi hui!"
        ),
        Vocabulary(
            id = "v_mot_hai_ba_dzo",
            vietnamese = "Một, hai, ba, dzô!",
            romanPhonetic = "Mo't, haay, baa, zoh!",
            hinglishMeaning = "Cheers! / Ek do teen cheers!",
            indianPhoneticTip = "Vietnamese dhabon (Quán nhậu) me sab milkar bolte hain!",
            category = "Connect",
            exampleVietnamese = "Một, hai, ba, dzô! Chúc sức khỏe!",
            exampleHinglish = "One, two, three, cheers! Aapki achhi sehat ke liye!"
        ),
        Vocabulary(
            id = "v_dep",
            vietnamese = "Đẹp",
            romanPhonetic = "Dep.",
            hinglishMeaning = "Sundar / Khubsurat (Beautiful)",
            indianPhoneticTip = "Dep heavy drop tone",
            category = "Connect",
            exampleVietnamese = "Việt Nam rất đẹp!",
            exampleHinglish = "Vietnam bohot sundar hai!"
        ),
        Vocabulary(
            id = "v_nong",
            vietnamese = "Nóng",
            romanPhonetic = "Nawng'",
            hinglishMeaning = "Garam (Hot)",
            indianPhoneticTip = "Rising sharp tone",
            category = "Time",
            exampleVietnamese = "Hôm nay trời nóng quá.",
            exampleHinglish = "Aaj bohot garmi hai."
        ),
        Vocabulary(
            id = "v_lanh",
            vietnamese = "Lạnh",
            romanPhonetic = "Lanh.",
            hinglishMeaning = "Thanda (Cold)",
            indianPhoneticTip = "Heavy underdot drop",
            category = "Time",
            exampleVietnamese = "Mùa đông ở Hà Nội lạnh.",
            exampleHinglish = "Hanoi me sardiyan thandi hoti hain."
        ),
        Vocabulary(
            id = "v_mua_troi",
            vietnamese = "Mưa",
            romanPhonetic = "Moo-ah",
            hinglishMeaning = "Baarish / Rain",
            indianPhoneticTip = "Flat tone",
            category = "Time",
            exampleVietnamese = "Trời đang mưa to.",
            exampleHinglish = "Tez baarish ho rahi hai."
        ),
        Vocabulary(
            id = "v_lon",
            vietnamese = "Lớn / To",
            romanPhonetic = "Luhn' / Taw",
            hinglishMeaning = "Bada (Big)",
            indianPhoneticTip = "Rising tone",
            category = "Shopping",
            exampleVietnamese = "Cái này quá to.",
            exampleHinglish = "Yeh piece bohot bada hai."
        ),
        Vocabulary(
            id = "v_nho",
            vietnamese = "Nhỏ",
            romanPhonetic = "Nyaw?",
            hinglishMeaning = "Chhota (Small)",
            indianPhoneticTip = "Dipping hook tone",
            category = "Shopping",
            exampleVietnamese = "Cho tôi size nhỏ hơn.",
            exampleHinglish = "Mujhe chhota size dijiye."
        ),
        Vocabulary(
            id = "v_nhieu",
            vietnamese = "Nhiều",
            romanPhonetic = "Nyew",
            hinglishMeaning = "Zyada / Bohot (Many / Much)",
            indianPhoneticTip = "Falling gentle tone",
            category = "Shopping",
            exampleVietnamese = "Nhiều người quá!",
            exampleHinglish = "Bohot zyada bheed hai!"
        ),
        Vocabulary(
            id = "v_it",
            vietnamese = "Ít",
            romanPhonetic = "Eet'",
            hinglishMeaning = "Thoda / Kam (Little / Few)",
            indianPhoneticTip = "Rising sharp pitch",
            category = "Food",
            exampleVietnamese = "Cho ít đường thôi nhé.",
            exampleHinglish = "Kam cheeni daalna please."
        ),
        Vocabulary(
            id = "v_vui",
            vietnamese = "Vui",
            romanPhonetic = "Vooy",
            hinglishMeaning = "Khush / Maza aana (Happy / Fun)",
            indianPhoneticTip = "Flat tone",
            category = "Connect",
            exampleVietnamese = "Hôm nay tôi rất vui.",
            exampleHinglish = "Aaj main bohot khush hoon."
        ),
        Vocabulary(
            id = "v_met",
            vietnamese = "Mệt",
            romanPhonetic = "Met.",
            hinglishMeaning = "Thaka hua (Tired)",
            indianPhoneticTip = "Met heavy drop tone",
            category = "Emergency",
            exampleVietnamese = "Tôi đi bộ mệt rồi.",
            exampleHinglish = "Main chalkar thak gaya hoon."
        ),
        Vocabulary(
            id = "v_hieu",
            vietnamese = "Hiểu",
            romanPhonetic = "Hee-ew?",
            hinglishMeaning = "Samajhna (To understand)",
            indianPhoneticTip = "Dipping tone",
            category = "Greetings",
            exampleVietnamese = "Tôi hiểu rồi!",
            exampleHinglish = "Main samajh gaya!"
        ),
        Vocabulary(
            id = "v_khong_hieu",
            vietnamese = "Không hiểu",
            romanPhonetic = "Khawng hee-ew?",
            hinglishMeaning = "Samajh nahi aaya (Don't understand)",
            indianPhoneticTip = "Tourists ke liye bohot handy",
            category = "Greetings",
            exampleVietnamese = "Xin lỗi, tôi không hiểu tiếng Việt.",
            exampleHinglish = "Sorry, mujhe Vietnamese samajh nahi aati."
        ),
        Vocabulary(
            id = "v_biet",
            vietnamese = "Biết",
            romanPhonetic = "Bee-et'",
            hinglishMeaning = "Pata hona / Janna (To know)",
            indianPhoneticTip = "Rising tone",
            category = "Greetings",
            exampleVietnamese = "Bạn có biết tiếng Anh không?",
            exampleHinglish = "Kya aapko English aati hai?"
        ),
        Vocabulary(
            id = "v_thich",
            vietnamese = "Thích",
            romanPhonetic = "Teek'",
            hinglishMeaning = "Pasand hona (To like)",
            indianPhoneticTip = "Rising tone",
            category = "Connect",
            exampleVietnamese = "Tôi rất thích Việt Nam.",
            exampleHinglish = "Mujhe Vietnam bohot pasand hai."
        ),
        Vocabulary(
            id = "v_bien",
            vietnamese = "Biển",
            romanPhonetic = "Bee-en?",
            hinglishMeaning = "Samundar / Beach",
            indianPhoneticTip = "Dipping hook tone",
            category = "Directions",
            exampleVietnamese = "Đà Nẵng có biển rất đẹp.",
            exampleHinglish = "Da Nang me samundar ka beach bohot pyara hai."
        )
    )

    val categories = listOf("All", "Greetings", "Pronouns", "Food", "Numbers", "Shopping", "Directions", "Transport", "Emergency", "Time", "Connect")
}
