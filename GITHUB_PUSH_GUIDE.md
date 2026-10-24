# Guide: Pushing VietLingo to GitHub

**Target Repository**: [https://github.com/samurygamerz-netizen/vietlingo](https://github.com/samurygamerz-netizen/vietlingo)

This project has already been initialized as a clean Git repository on the `main` branch with the remote `origin` pre-configured to `https://github.com/samurygamerz-netizen/vietlingo.git`.

---

## Method 1: Push via AI Studio Interface (1-Click)

1. In the top bar of the Google AI Studio interface, click the **GitHub** icon or the **Settings** menu (`⋮` / gear icon).
2. Select **"Push to GitHub"** (or **"Export to GitHub"**).
3. If prompted:
   - Select your GitHub account: `samurygamerz-netizen`
   - Select repository: `vietlingo`
4. Confirm the push. AI Studio will sync the committed files directly to GitHub.

---

## Method 2: Push via Terminal / Command Line

If you clone or export the project to your local machine:

### 1. Generate a GitHub Personal Access Token (PAT)
GitHub requires a Personal Access Token instead of your account password:
1. Go to **GitHub Settings** → **Developer Settings** → **Personal Access Tokens** → **Tokens (classic)** (or Fine-grained tokens).
2. Click **Generate new token**.
3. Give it a note (e.g. `vietlingo-push`), select expiration, and check the **`repo`** scope.
4. Copy the generated token (`ghp_...`).

### 2. Push to GitHub
Run the following commands in the project root directory:

```bash
# Verify the remote is set to your repository
git remote -v
# Output should show:
# origin  https://github.com/samurygamerz-netizen/vietlingo.git (fetch)
# origin  https://github.com/samurygamerz-netizen/vietlingo.git (push)

# If not set, run:
git remote add origin https://github.com/samurygamerz-netizen/vietlingo.git

# Push the main branch:
git branch -M main
git push -u origin main
```

When prompted:
- **Username**: `samurygamerz-netizen`
- **Password**: *Paste your GitHub Personal Access Token (PAT)*

---

## Method 3: Push via SSH (Alternative)

If you have SSH keys configured on your machine:
```bash
git remote set-url origin git@github.com:samurygamerz-netizen/vietlingo.git
git push -u origin main
```

---

## Method 4: Upload via GitHub Web UI (Zero Tools Required)

1. In AI Studio, click **Settings (`⋮`)** → **Export as ZIP** to download the project.
2. Unzip the archive on your device.
3. Open [https://github.com/samurygamerz-netizen/vietlingo](https://github.com/samurygamerz-netizen/vietlingo) in your browser.
4. Click **Add file** → **Upload files**.
5. Drag and drop the unzipped project folder (excluding `.gradle/`, `build/`, and `.env`).
6. Click **Commit changes**.

---

## 🛡️ Security & `.gitignore` Configuration

The project includes an optimized `.gitignore` file that strictly excludes:
- `*.env` & `local.properties`: Prevents API keys or secrets from leaking to GitHub.
- `debug.keystore` & `*.keystore`: Prevents private signing keys from leaking.
- `/build` & `app/build`: Excludes compiled class files, DEX, and intermediate build cache.
- `.gradle/` & `.kotlin/`: Excludes local toolchain and IDE caches.
- `.build-outputs/` & `.aistudio/`: Excludes temporary container metadata.

The `.env.example` file is safely tracked so other developers know which environment variables to set.
