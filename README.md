# Minecraft Forge Mod: Command Execution PoC (Educational Use Only)

⚠️ **Warning**: This is a proof-of-concept (PoC) Minecraft Forge mod for **educational and security research purposes only**. It demonstrates the risks of executing untrusted mods. **Do not use on systems without explicit permission or for malicious purposes.**

## 📖 Overview

This PoC mod illustrates how a Minecraft Forge mod can execute arbitrary system commands during initialization. When loaded in the `mods` folder, it triggers a harmless command to open the Windows Calculator (`calc.exe`) as a demonstration of code execution.

### 🔍 Purpose
- Raise awareness about the dangers of unverified mods in Minecraft.
- Highlight the lack of sandboxing in some mod loaders.
- Educate the modding and security communities on code execution risks.

## ⚖️ Ethical and Legal Considerations

### Ethical Guidelines
- **Informed Consent**: Only run this mod on systems you own or have explicit permission to test.
- **Transparency**: Never obfuscate or hide the mod’s behavior.
- **Educational Use**: Use only in controlled test environments for security demonstrations.
- **No Harm**: Do not use to deceive, exploit, or harm others.

### Legal Disclaimer
- This mod is provided **for educational and research purposes only**.
- The author is **not responsible** for any misuse, damage, or illegal activities caused by this code.
- Use and distribution are at your own risk, with **no warranties** provided.

## 🔐 Security Insights

This mod underscores critical security issues:
- **Untrusted Mods**: Blindly installing mods can lead to malicious code execution.
- **Mod Loader Vulnerabilities**: Forge’s lifecycle events allow mods to run arbitrary code without restrictions.
- **Attack Vectors**: Malicious mods could execute scripts, download payloads, or alter system files.

## 🛠️ How It Works

During Forge’s mod initialization:
1. The mod hooks into the `FMLClientSetupEvent`.
2. It uses Java’s `Runtime.getRuntime().exec()` to run:
   ```java
   Runtime.getRuntime().exec("cmd /K calc");
   ```
3. On Windows, this opens the Calculator app as a visible proof of execution.

### ⚠️ Potential Risks
While this example is harmless, the same technique could:
- Execute malicious scripts.
- Download and run remote payloads.
- Modify or delete system files.

## 📦 Installation (Test Environment Only)

⚠️ **Use only in a secure, isolated test environment!**

1. Install Minecraft with the appropriate Forge version.
2. Compile the mod and place the `.jar` file in the `mods` folder.
3. Launch Minecraft.
4. Observe the Calculator app opening as proof of command execution.

## 🧑‍🔬 Responsible Use

### ✅ Allowed Use Cases
- Security workshops or classroom demonstrations.
- Controlled testing in isolated environments.
- Educational content creation (e.g., blogs, videos).

### 🚫 Prohibited Actions
- Distributing the mod in public modpacks or servers.
- Using it to deceive or harm users.
- Hiding the mod’s functionality or intent.

## 📚 Resources

- [OWASP: Arbitrary Code Execution](https://owasp.org/www-community/attacks/Code_Injection)
- [Minecraft Forge Documentation](https://docs.minecraftforge.net/en/latest/)
- [Java Runtime.exec() Security Risks](https://www.securecoding.cert.org/confluence/display/java/SEC05-J.+Do+not+use+Runtime.exec()+to+execute+external+programs)

## 🚨 Final Warning

This PoC is **not a toy**. It exposes a real vulnerability in modded Minecraft setups. Use it to **educate and protect**, not to exploit.

## 👤 Author

Developed by a game mod security researcher.  
Contributions are welcome but must adhere to ethical and legal guidelines.