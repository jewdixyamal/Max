package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ou9  reason: default package */
public final class ou9 extends pu9 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final kua g;
    public CharSequence h;
    public Boolean i;

    public ou9(kua kua) {
        if (!TextUtils.isEmpty(kua.a)) {
            this.g = kua;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        kua kua = this.g;
        bundle.putCharSequence("android.selfDisplayName", kua.a);
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", kua.a);
        IconCompat iconCompat = kua.b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle2.putInt("type", iconCompat.a);
            bundle2.putInt("int1", iconCompat.e);
            bundle2.putInt("int2", iconCompat.f);
            bundle2.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", kua.c);
        bundle3.putString("key", kua.d);
        bundle3.putBoolean("isBot", kua.e);
        bundle3.putBoolean("isImportant", kua.f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", nu9.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", nu9.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public final void b(m5d m5d) {
        bu9 bu9 = (bu9) this.b;
        boolean z = false;
        if (bu9 == null || bu9.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.h != null) {
            z = true;
        }
        this.i = Boolean.valueOf(z);
        kua kua = this.g;
        kua.getClass();
        Notification.MessagingStyle a = ku9.a(jua.b(kua));
        Iterator it = this.e.iterator();
        while (true) {
            Person person = null;
            if (!it.hasNext()) {
                break;
            }
            nu9 nu9 = (nu9) it.next();
            kua kua2 = nu9.c;
            if (kua2 != null) {
                person = jua.b(kua2);
            }
            Notification.MessagingStyle.Message b = mu9.b(nu9.a, nu9.b, person);
            String str = nu9.e;
            if (str != null) {
                lu9.b(b, str, nu9.f);
            }
            iu9.a(a, b);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            nu9 nu92 = (nu9) it2.next();
            kua kua3 = nu92.c;
            Notification.MessagingStyle.Message b2 = mu9.b(nu92.a, nu92.b, kua3 == null ? null : jua.b(kua3));
            String str2 = nu92.e;
            if (str2 != null) {
                lu9.b(b2, str2, nu92.f);
            }
            ju9.a(a, b2);
        }
        this.i.getClass();
        iu9.c(a, this.h);
        ku9.b(a, this.i.booleanValue());
        a.setBuilder((Notification.Builder) m5d.c);
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
