package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: xw4  reason: default package */
public final class xw4 implements zb4 {
    public final /* synthetic */ gh7 a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public xw4(EmojiCompatInitializer emojiCompatInitializer, gh7 gh7) {
        this.b = emojiCompatInitializer;
        this.a = gh7;
    }

    public final void onResume(eh7 eh7) {
        this.b.getClass();
        qd3.a(Looper.getMainLooper()).postDelayed(new wdg(3), 500);
        this.a.f(this);
    }
}
