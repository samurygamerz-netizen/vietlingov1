# VietLingo (ViệtLingo) 🇻🇳 ⇄ 🇮🇳
**Vietnamese Language Learning for Indian Beginners (Hinglish Guide)**

VietLingo is a complete, mobile-first Vietnamese language learning app crafted specifically for Indian learners who understand Hinglish written in Roman script (NOT Devanagari Hindi).

---

## 🌟 Core Features

1. **Hinglish Explanations (Roman Script)**:
   - Concepts explained naturally in casual, accessible Roman Hinglish (e.g., *"Xin chào ka matlab Namaste ya Hello hota hai"*, *"Vietnamese me pronoun age aur rishte ke hisaab se use hote hain"*).
2. **Vietnamese Pronunciation & 6 Tones Masterclass**:
   - Comprehensive breakdown of all 6 tones:
     - **Thanh Ngang (Flat)**: Like saying normal "Haan".
     - **Thanh Huyền (Falling `)**: Like saying relaxed "Achaa...".
     - **Thanh Sắc (Rising ´)**: High rising pitch like asking "KAHAN?".
     - **Thanh Hỏi (Dipping-Rising ?)**: Questioning curiosity like "Sach mein?".
     - **Thanh Ngã (High Broken ~)**: Glottal break like saying "Na-ah!".
     - **Thanh Nặng (Heavy Drop .)**: Abrupt sudden drop and stop like "Ruk!".
   - Consonant & vowel pronunciation rules for Indian speakers (`PH = F`, `D = Z/Y`, `Đ = D`, `KH = ख़`, and unreleased final consonants `p/t/c`).
3. **10 Structured Beginner Lessons**:
   - Lesson 1: Greetings & Polite Etiquette (*Xin chào, Cảm ơn, Dạ, Vâng*)
   - Lesson 2: Personal Pronouns & Respect (*Anh, Chị, Em, Bác, Chú* — Indian Bhaiya/Didi system)
   - Lesson 3: Numbers & Money (*1 to 100, Triệu vs Lakhs currency conversion*)
   - Lesson 4: Food & Vegetarian Survival (*Ăn chay*, No fish sauce *Không nước mắm*, *Phở*, *Cà phê sữa đá*)
   - Lesson 5: Asking Questions & Directions (*Ở đâu, Đi thẳng, Rẽ trái, Rẽ phải*)
   - Lesson 6: Shopping & Bargaining (*Đắt quá! Bớt được không?*)
   - Lesson 7: Transport & Getting Around (*Grab, Xe ôm motorbike taxi, Sân bay*)
   - Lesson 8: Health, Pharmacy & Emergency (*Cứu tôi với, Bệnh viện, Tiệm thuốc*)
   - Lesson 9: Time, Days & Routine (*Mấy giờ, Hôm nay, Ngày mai*)
   - Lesson 10: Making Friends & Indian-Vietnamese Connect (*Ấn Độ, Du lịch, Một-hai-ba-dzô!*)
4. **100+ Curated Vocabulary Items**:
   - Complete Vietnamese spelling with diacritics.
   - Exact phonetic guide in Roman letters (e.g. *Phở* = *Fuh?*, *Cảm ơn* = *Kaam? un*).
   - Hinglish meaning, usage tips, and example sentences.
   - Dual Mode: Searchable list view & Interactive Flashcard flip mode!
5. **30 Interactive Quizzes**:
   - Multiple choice questions covering vocabulary, tones, culture, and grammar.
   - Instant visual feedback (green/red) and detailed Hinglish explanations for every question.
   - Scoring, streak tracking, and restart/retry options.
6. **10 Everyday Dual-Dialogue Conversations**:
   - Dual-speaker roleplay cards with audio playback for every sentence.
7. **Audio Speech Features (TTS)**:
   - Built-in Android `TextToSpeech` with graceful handling when Vietnamese voice data is missing from the device.
8. **VietGuru AI Language Tutor**:
   - Built-in intelligent offline answers for common questions (Vegetarian food, 6 tones shortcuts, bargaining tips).
   - Optional live Gemini AI integration via Google AI Studio (`GEMINI_API_KEY`).
9. **Offline Support & Local Persistence**:
   - 100% functional offline without network.
   - Lesson completions, bookmarks, quiz points, and streak days stored permanently using SharedPreferences.

---

## 📜 Open Source Attribution & Inspiration

VietLingo takes architectural and curriculum inspiration from the open-source project:
- **Project**: [learn-vietnamese](https://github.com/katawaredev/learn-vietnamese) by **katawaredev**
- **License**: MIT License
- **Attribution**: The curriculum topics, lesson flow, and phrase structure were inspired by `katawaredev/learn-vietnamese`. VietLingo adapts and enhances these materials specifically for Indian learners with Roman script Hinglish pedagogy, tone analogies based on Indian speech habits, pure vegetarian dining guides (*Ăn Chay*), Indian currency approximations (*Đồng vs Rupee*), and Jetpack Compose mobile architecture.

---

## 🛠️ Tech Stack & Architecture

- **Platform**: Android (minSdk 24, targetSdk 36)
- **Language**: Kotlin 2.2.10
- **UI Framework**: Jetpack Compose with Material Design 3 (M3)
- **Architecture**: MVVM (Model-View-ViewModel) with StateFlow
- **Audio**: Android TextToSpeech (`android.speech.tts.TextToSpeech`)
- **Networking & AI**: OkHttp, Retrofit, Gemini 3.5 Flash REST API
- **Persistence**: Android SharedPreferences with reactive StateFlow

---

## 🚀 Building & Running

1. **Compile & Run**:
   Run `gradle :app:assembleDebug` or use the AI Studio Streaming Emulator preview.
2. **Run Unit Tests**:
   `gradle :app:testDebugUnitTest`
3. **Optional Gemini API Key**:
   Configure `GEMINI_API_KEY` in the AI Studio Secrets panel. The app works 100% offline even without an API key!

---

## 📦 GitHub Repository

- **Repository**: [https://github.com/samurygamerz-netizen/vietlingo](https://github.com/samurygamerz-netizen/vietlingo)
- **Pushing changes**:
  ```bash
  git remote add origin https://github.com/samurygamerz-netizen/vietlingo.git
  git branch -M main
  git push -u origin main
  ```

