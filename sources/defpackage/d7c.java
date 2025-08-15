package defpackage;

import java.util.Collection;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: d7c  reason: default package */
public final /* synthetic */ class d7c implements sj3 {
    public final /* synthetic */ je7 a;
    public final /* synthetic */ ReactionsViewModel b;

    public /* synthetic */ d7c(je7 je7, ReactionsViewModel reactionsViewModel) {
        this.a = je7;
        this.b = reactionsViewModel;
    }

    public final void accept(Object obj) {
        Collection collection = (Collection) obj;
        ec6 ec6 = (ec6) this.a.getValue();
        e52 i = this.b.i();
        if (i != null) {
            ec6.a(i, collection);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
