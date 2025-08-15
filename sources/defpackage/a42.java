package defpackage;

import android.view.View;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import one.me.members.list.MembersListWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: a42  reason: default package */
public final /* synthetic */ class a42 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ a42(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        e5f e5f = e5f.a;
        m56 m56 = this.b;
        switch (this.a) {
            case 0:
                m56.invoke((CharSequence) obj);
                return e5f;
            case 1:
                m56.invoke((String) obj);
                return e5f;
            case 2:
                return ExceptionsConstructorKt.safeCtor$lambda$9(m56, (Throwable) obj);
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                bc7[] bc7Arr = MembersListWidget.D0;
                if (((kn8) m56.invoke(num)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                Integer num2 = (Integer) obj;
                num2.intValue();
                bc7[] bc7Arr2 = MembersListWidget.D0;
                kn8 kn8 = (kn8) m56.invoke(num2);
                if (kn8 != null) {
                    z = kn8.v0;
                }
                return Boolean.valueOf(z);
            case 5:
                bc7[] bc7Arr3 = ProfileChangeLinkScreen.v0;
                m56.invoke((View) obj);
                return e5f;
            default:
                bc7[] bc7Arr4 = ProfileChangeLinkScreen.v0;
                m56.invoke((View) obj);
                return e5f;
        }
    }
}
