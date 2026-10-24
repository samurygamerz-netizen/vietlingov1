package com.example.data.repository

import com.example.data.model.Conversation
import com.example.data.model.DialogueLine

object ConversationData {
    val conversations: List<Conversation> = listOf(
        Conversation(
            id = "c1",
            title = "Meeting at Hanoi Old Quarter",
            titleHinglish = "Pehli Baar Mulakaat (Hanoi)",
            contextHinglish = "Indian tourist Rahul ek local Vietnamese student Linh se coffee shop ke bahar milta hai.",
            dialogues = listOf(
                DialogueLine("Rahul", "Tourist", "Xin chào chị!", "Sin chow chee.!", "Namaste didi!"),
                DialogueLine("Linh", "Local", "Chào em! Em từ đâu đến?", "Chow em! Em too dow den'?", "Hello bhai! Tum kahan se aaye ho?"),
                DialogueLine("Rahul", "Tourist", "Em là người Ấn Độ, em đến du lịch.", "Em laa ngoo-oy Un' Doh., em den' zoo leek..", "Main Bharat se hoon, yahan ghoomne aaya hoon."),
                DialogueLine("Linh", "Local", "Ồ, rất vui được gặp em!", "Oh, rut' vooy du-uk. gaap. em!", "Arrey wah, aapse milkar bohot khushi hui!"),
                DialogueLine("Rahul", "Tourist", "Em cũng rất vui được gặp chị!", "Em coong? rut' vooy du-uk. gaap. chee.!", "Mujhe bhi aapse milkar bohot accha laga!")
            )
        ),
        Conversation(
            id = "c2",
            title = "Ordering Pure Vegetarian Food",
            titleHinglish = "Shakahari Khana Order Karna",
            contextHinglish = "Priya local street restaurant me bina meat aur bina fish sauce wala khana order kar rahi hai.",
            dialogues = listOf(
                DialogueLine("Priya", "Customer", "Cô ơi, ở đây có món chay không ạ?", "Koh uy, uh? daay caw' mawn' chai khawng aa.?", "Aunty ji, kya yahan veg khana milega?"),
                DialogueLine("Owner", "Restaurant Owner", "Có em, có phở chay và đậu phụ sốt cà chua.", "Caw' em, caw' fuh? chai vaa dow. foo. shoht' kaa choo-ah.", "Haan beta, veg noodle soup aur tomato tofu hai."),
                DialogueLine("Priya", "Customer", "Làm ơn không cho nước mắm nhé cô!", "Laam un khawng chaw nu-uk' maam' nyeh' koh!", "Please fish sauce bilkul mat daaliyega aunty!"),
                DialogueLine("Owner", "Restaurant Owner", "Yên tâm, quán chay không có nước mắm đâu.", "E-en tum, kwaan' chai khawng caw' nu-uk' maam' dow.", "Fikar mat karo, veg restaurant me fish sauce nahi hota."),
                DialogueLine("Priya", "Customer", "Dạ, cho cháu một tô phở chay ạ!", "Zaa., chaw chow' mo't toh fuh? chai aa.!", "Haanji, mere liye ek bowl veg pho le aaiye!")
            )
        ),
        Conversation(
            id = "c3",
            title = "Bargaining at Ben Thanh Market",
            titleHinglish = "Market me Bargaining Karna",
            contextHinglish = "Arun Saigon ke famous Ben Thanh Market me souvenir nón lá (conical hat) kharid raha hai.",
            dialogues = listOf(
                DialogueLine("Arun", "Shopper", "Chị ơi, cái nón lá này bao nhiêu tiền?", "Chee. uy, kaay' nawn' laa' naay bow nyew tee-en?", "Didi ji, yeh topi kitne ki hai?"),
                DialogueLine("Vendor", "Shopkeeper", "Hai trăm nghìn em nhé.", "Haay chum ngeen em nyeh'.", "Do sau hazaar (200k VND) chote bhai."),
                DialogueLine("Arun", "Shopper", "Trời ơi, đắt quá! Một trăm nghìn được không?", "Chuh-y uy, dut' kwah'! Mo't chum ngeen du-uk. khawng?", "Are baap re, bohot mehenga hai! 100k me doge?"),
                DialogueLine("Vendor", "Shopkeeper", "Không được đâu, một trăm rưỡi nhé!", "Khawng du-uk. dow, mo't chum zu-oy' nyeh'!", "Nahi hoga bhai, 150k de do!"),
                DialogueLine("Arun", "Shopper", "Một trăm hai mươi nghìn, em mua hai cái!", "Mo't chum haay mu-oy ngeen, em moo-ah haay kaay'!", "120k lagao, main 2 pieces le lunga!"),
                DialogueLine("Vendor", "Shopkeeper", "Được rồi, bán cho em!", "Du-uk. zoy, baan' chaw em!", "Theek hai, le jao!")
            )
        ),
        Conversation(
            id = "c4",
            title = "Taking a Xe Ôm (Motorbike Taxi)",
            titleHinglish = "Bike Taxi Book Karna",
            contextHinglish = "Vikas road corner par khade ek bike taxi uncle se hotel tak drop karne ki baat karta hai.",
            dialogues = listOf(
                DialogueLine("Vikas", "Rider", "Chú ơi, có chở xe ôm không?", "Choo' uy, caw' chuh? seh ohm khawng?", "Uncle ji, bike taxi par le chaloge?"),
                DialogueLine("Driver", "Xe Ôm Driver", "Có cháu, đi đâu thế?", "Caw' chow', dee dow teh'?", "Haan beta, kahan chalna hai?"),
                DialogueLine("Vikas", "Rider", "Đến khách sạn Rex ở Quận 1, bao nhiêu tiền?", "Den' khuk' saan. Rex uh? Kwan. 1, bow nyew tee-en?", "District 1 me Rex Hotel tak, kitne paise loge?"),
                DialogueLine("Driver", "Xe Ôm Driver", "Năm mươi nghìn đồng, lên xe đi!", "Num mu-oy ngeen dawng, len seh dee!", "50,000 VND (50k), baitho gaadi pe!"),
                DialogueLine("Vikas", "Rider", "Chú cho cháu xin mũ bảo hiểm nhé.", "Choo' chaw chow' sin moo~ bow? hee-em? nyeh'.", "Uncle mujhe helmet de dijiye please.")
            )
        ),
        Conversation(
            id = "c5",
            title = "Ordering Coffee at Street Stall",
            titleHinglish = "Street Cafe me Coffee Peena",
            contextHinglish = "Kunal choti plastic chairs wale roadside stall par iconic milk coffee order kar raha hai.",
            dialogues = listOf(
                DialogueLine("Kunal", "Customer", "Anh ơi, cho một ly cà phê sữa đá!", "Aynh uy, chaw mo't lee kaa fey suu~ah daa'!", "Bhaiya, ek glass cold milk coffee dena!"),
                DialogueLine("Barista", "Cafe Owner", "Có uống ngọt nhiều không em?", "Caw' oong' ngawt. nyew khawng em?", "Zyada meethi chalegi kya chote?"),
                DialogueLine("Kunal", "Customer", "Ít ngọt thôi anh, và cho thêm một ly trà đá nhé.", "Eet' ngawt. toy aynh, vaa chaw tem mo't lee chaa daa' nyeh'.", "Thodi kam meethi bhaiya, aur sath me ek glass iced tea bhi."),
                DialogueLine("Barista", "Cafe Owner", "Có ngay, ngồi ghế đợi chút nhé!", "Caw' ngaay, ngoy` geh' doy. choot' nyeh'!", "Abhi laya, chair pe baitho 2 minute!"),
                DialogueLine("Kunal", "Customer", "Dạ, em cảm ơn!", "Zaa., em kaam? un!", "Haanji, thank you!")
            )
        ),
        Conversation(
            id = "c6",
            title = "Finding Washroom & Directions",
            titleHinglish = "Washroom aur Directions Poochna",
            contextHinglish = "Neha train station me washroom dhoondh rahi hai.",
            dialogues = listOf(
                DialogueLine("Neha", "Traveler", "Xin lỗi anh, cho em hỏi nhà vệ sinh ở đâu ạ?", "Sin loy~ aynh, chaw em hoy? nyah vey. sin uh? dow aa.?", "Excuse me bhaiya, washroom kahan hai ji?"),
                DialogueLine("Staff", "Station Guard", "Nhà vệ sinh ở đằng kia, cạnh quầy bán vé.", "Nyah vey. sin uh? dung kee-ah, kanh. kway? baan' veh'.", "Washroom wahan aage hai, ticket counter ke paas."),
                DialogueLine("Neha", "Traveler", "Đi thẳng rồi rẽ phải đúng không anh?", "Dee thung? zoy ze~ faay? doong' khawng aynh?", "Seedhe jaake right mudna hai na bhaiya?"),
                DialogueLine("Staff", "Station Guard", "Đúng rồi em!", "Doong' zoy em!", "Bilkul sahi!"),
                DialogueLine("Neha", "Traveler", "Em cảm ơn anh nhiều ạ!", "Em kaam? un aynh nyew aa.!", "Aapka bohot bohot shukriya!")
            )
        ),
        Conversation(
            id = "c7",
            title = "Buying a Train Ticket to Da Nang",
            titleHinglish = "Da Nang ki Train Ticket Lena",
            contextHinglish = "Gaurav ticket counter par sleeper train ticket book kar raha hai.",
            dialogues = listOf(
                DialogueLine("Gaurav", "Passenger", "Chị ơi, tôi muốn mua một vé đi Đà Nẵng.", "Chee. uy, toy moo-on' moo-ah mo't veh' dee Daa` Nung~.", "Didi, mujhe Da Nang ki ek ticket kharidni hai."),
                DialogueLine("Clerk", "Ticket Clerk", "Anh đi ngày nào? Giường nằm hay ghế mềm?", "Aynh dee ngaay naao? Zoo-ong num` hay geh' mem`?", "Aap kis din jaoge? Sleeper ya soft seat?"),
                DialogueLine("Gaurav", "Passenger", "Ngày mai, cho tôi một giường nằm điều hòa.", "Ngaay maay, chaw toy mo't zoo-ong num` dee-ew` hwaa.", "Kal ke din, mujhe ek AC sleeper berth dijiye."),
                DialogueLine("Clerk", "Ticket Clerk", "Tổng cộng tám trăm nghìn đồng anh nhé.", "Tawng? kawng. taam' chum ngeen dawng aynh nyeh'.", "Total 800,000 VND (800k) hua bhaiya."),
                DialogueLine("Gaurav", "Passenger", "Đây là tiền, cảm ơn chị!", "Daay laa tee-en, kaam? un chee.!", "Yeh lijiye paise, thank you didi!")
            )
        ),
        Conversation(
            id = "c8",
            title = "Pharmacy Visit for Health Issues",
            titleHinglish = "Chemist se Dawai Lena",
            contextHinglish = "Rohit street food khane ke baad pet dard ki dawai lene pharmacy jata hai.",
            dialogues = listOf(
                DialogueLine("Rohit", "Patient", "Chào chị, tôi bị đau bụng và tiêu chảy.", "Chow chee., toy bee. dow boong. vaa tee-ew chaay?.", "Namaste didi, mere pet me dard aur loose motions hain."),
                DialogueLine("Pharmacist", "Chemist", "Anh có bị sốt hay nôn không?", "Aynh caw' bee. shoht' hay nohn khawng?", "Kya aapko bukhar ya ulti bhi hai?"),
                DialogueLine("Rohit", "Patient", "Không sốt, chỉ đau bụng thôi.", "Khawng shoht', chee? dow boong. toy.", "Bukhar nahi hai, sirf pet me dard hai."),
                DialogueLine("Pharmacist", "Chemist", "Uống thuốc này ngày hai lần, nhớ uống nhiều nước!", "Oong' thoo-uk' naay ngaay haay lun`, nyuh' oong' nyew nu-uk'!", "Yeh medicine din me 2 baar lein, aur khub paani piyein!"),
                DialogueLine("Rohit", "Patient", "Bao nhiêu tiền vậy chị?", "Bow nyew tee-en vaay. chee.?", "Kitne paise huye didi?")
            )
        ),
        Conversation(
            id = "c9",
            title = "Hotel Check-in",
            titleHinglish = "Hotel me Check-in Karna",
            contextHinglish = "Aditi Da Nang ke resort reception par check-in kar rahi hai.",
            dialogues = listOf(
                DialogueLine("Aditi", "Guest", "Xin chào, tôi có đặt phòng trước.", "Sin chow, toy caw' daat. fawng` troo-uk'.", "Hello, meri pehle se room booking hai."),
                DialogueLine("Receptionist", "Staff", "Dạ chào chị, cho em xin hộ chiếu ạ.", "Zaa. chow chee., chaw em sin hoh. chew' aa.!", "Namaste didi, apna passport dikhaiye please."),
                DialogueLine("Aditi", "Guest", "Hộ chiếu của tôi đây. Mấy giờ có bữa sáng?", "Hoh. chew' coo-ah? toy daay. May' zoe caw' buu~ah shaang'?", "Yeh raha mera passport. Breakfast kitne baje hota hai?"),
                DialogueLine("Receptionist", "Staff", "Bữa sáng từ sáu giờ đến chín giờ rưỡi ạ.", "Buu~ah shaang' too sow' zoe den' cheen' zoe zu-oy' aa.", "Breakfast subah 6:00 se 9:30 baje tak rehta hai."),
                DialogueLine("Aditi", "Guest", "Cảm ơn em nhiều nhé!", "Kaam? un em nyew nyeh'!", "Bohot bohot shukriya!")
            )
        ),
        Conversation(
            id = "c10",
            title = "Making Friends & Cheers (Một Hai Ba Dzô!)",
            titleHinglish = "Dosto ke Sath Cheers Ritual",
            contextHinglish = "Sameer roadside seafood restaurant me local group ke sath baithkar cheers karta hai.",
            dialogues = listOf(
                DialogueLine("Huy", "Local Friend", "Anh bạn Ấn Độ, cùng uống một ly nhé!", "Aynh baan. Un' Doh., coong` oong' mo't lee nyeh'!", "Indian bhai, humare sath ek drink share karo!"),
                DialogueLine("Sameer", "Indian Traveler", "Dạ vâng, rất vui được làm quen với các bạn!", "Zaa. vung, rut' vooy du-uk. laam kwen vuh-y' caak' baan.!", "Haanji, aap sabse dosti karke bohot khushi hui!"),
                DialogueLine("Huy", "Local Friend", "Nào, chuẩn bị! Một, hai, ba, dzô!", "Now`, choo-un? bee.! Mo't, haay, baa, zoh!", "Chalo ready ho jao! 1, 2, 3, Cheers!"),
                DialogueLine("All", "Group", "Hai, ba, dzô! Hai, ba, uống!!", "Haay, baa, zoh! Haay, baa, oong'!!", "2, 3, Cheers! 2, 3, Piyo!!"),
                DialogueLine("Sameer", "Indian Traveler", "Haha tuyệt vời! Việt Nam số một!", "Haha too-yet. vuh-y! Vee-et. Num shoh' mo't.!", "Haha maza aa gaya! Vietnam number one!")
            )
        )
    )
}
