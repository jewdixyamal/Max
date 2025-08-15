package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import one.me.android.deeplink.NewWidgetActivity;

/* renamed from: lca  reason: default package */
public final class lca {
    public final Context a;
    public final je7 b;

    public lca(Context context, je7 je7) {
        this.a = context;
        this.b = je7;
    }

    public final void a(long j) {
        Uri h = c54.h(ey8.i(j, ":chats?id=", "&type=local"), ((fl7) ((al) this.b.getValue())).b, (String) null);
        int i = NewWidgetActivity.V0;
        Context context = this.a;
        Intent intent = new Intent(context, NewWidgetActivity.class);
        intent.putExtra("deep_link", h);
        intent.putExtra("snackbar", (Parcelable) null);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
