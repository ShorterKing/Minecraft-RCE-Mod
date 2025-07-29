# 🎮 Minecraft Forge Mod: Command Execution PoC (Educational Use Only) 🚨

## ⚠️ **Critical Warning**
This is a **proof-of-concept (PoC)** Minecraft Forge mod for **educational and security research purposes only** 📚. It shows how untrusted mods can execute harmful code. **DO NOT** use this on systems without explicit permission or for malicious purposes! 🚫 Misuse could violate laws or cause serious harm. 😱

## 🌟 Overview
This PoC mod demonstrates the **dangers** of installing unverified Minecraft Forge mods. When loaded in the `mods` folder, it runs a **harmless command** to open the Windows Calculator (`calc.exe`) during initialization, proving how easily mods can execute system commands. 🖥️

### 🎯 Purpose
- 🕵️‍♂️ **Raise Awareness**: Highlight the risks of unverified mods in Minecraft.
- 🔍 **Expose Weaknesses**: Show how mod loaders like Forge lack sandboxing.
- 📖 **Educate**: Teach modders, server admins, and players about code execution risks.

## ⚖️ Ethical & Legal Guidelines

### 🤝 Ethical Use
- ✅ **Informed Consent**: Only test on systems you own or have **explicit permission** to use.
- 🔔 **Transparency**: Never hide or obfuscate the mod’s behavior.
- 📚 **Educational Only**: Use in controlled environments for learning or demos.
- 🛑 **No Harm**: Do not deceive, exploit, or harm others with this mod.

### 📜 Legal Disclaimer
- This mod is for **educational and research purposes only**.
- The author is **not responsible** for misuse, damage, or illegal activities.
- Use and distribution are at **your own risk**, with **no warranties** provided.

## 🔐 Security Insights
This mod reveals **critical security risks** in modded Minecraft:
- 🚨 **Untrusted Mods**: Installing random mods can lead to malicious code execution.
- ⚙️ **Mod Loader Vulnerabilities**: Forge’s lifecycle events allow unrestricted code execution.
- 😈 **Attack Vectors**: Malicious mods could run scripts, download payloads, or destroy files.

## 🛠️ How It Works
During Forge’s mod initialization, the mod:
1. Hooks into the `FMLClientSetupEvent`. 🔗
2. Uses Java’s `Runtime.getRuntime().exec()` to run:
   ```java
   Runtime.getRuntime().exec("cmd /K calc");
   ```
3. On Windows, this opens the Calculator app as a **visible proof** of command execution. 🖥️

### ⚠️ Potential Risks
While this example is harmless, the same technique could:
- 🦠 Execute malicious scripts or malware.
- 📥 Download and run harmful payloads from the internet.
- 🗑️ Modify or delete critical system files.

## 📦 Installation (Test Environment Only)
⚠️ **Use only in a secure, isolated test environment!** 🧪

1. **Set Up Forge**:
   - Install Minecraft with the correct Forge version. ⚒️
2. **Build the Mod**:
   - Compile the mod into a `.jar` file using a Java environment and Forge dependencies. 🛠️
3. **Deploy**:
   - Place the `.jar` in the `mods` folder of your test Minecraft instance. 📥
4. **Launch Minecraft**:
   - Start the game and watch the Calculator app open as proof of execution. 🎉
5. **Analyze**:
   - Review the mod’s code to understand how it triggers commands. 📖

## 🧑‍🔬 Responsible Use

### ✅ Allowed Use Cases
- 🏫 Security workshops or classroom demos.
- 🧪 Controlled testing in isolated environments (e.g., VMs, Docker).
- 🎥 Educational content creation (e.g., blogs, videos, tutorials).

### 🚫 Prohibited Actions
- 🚫 Sharing the mod in public modpacks or servers.
- 🙅‍♂️ Using it to trick or harm users.
- 🕵️ Hiding the mod’s functionality or intent.

## 📚 Resources
- 🔗 [OWASP: Arbitrary Code Execution](https://owasp.org/www-community/attacks/Code_Injection)
- ⚒️ [Minecraft Forge Documentation](https://docs.minecraftforge.net/en/latest/)
- 🛡️ [Java Runtime.exec() Security Risks](https://www.securecoding.cert.org/confluence/display/java/SEC05-J.+Do+not+use+Runtime.exec()+to+execute+external+programs)

## 🚨 Final Warning
This PoC is **not a toy**! 🎭 It exposes a **real vulnerability** in modded Minecraft setups. Use it to **educate and protect**, not to exploit. Stay safe and always vet mods before installing! 🛡️

## 👤 Author
Crafted by a game mod security researcher. 🧑‍💻  
Contributions are welcome but must follow **ethical and legal guidelines**. Submit ideas via pull requests to improve the educational value! 💡

## 💬 Stay Secure!
Protect your Minecraft experience by **auditing mods** and learning from projects like this. Happy modding, and stay safe! 🔒