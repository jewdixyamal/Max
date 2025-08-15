package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: edb  reason: default package */
public final /* synthetic */ class edb implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ edb(long j, ek2 ek2) {
        this.a = 0;
        this.c = ek2;
        this.b = j;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                ek2 ek2 = ek2.ADMIN;
                ek2 ek22 = (ek2) this.c;
                long j = this.b;
                return ek22 == ek2 ? new ChatAdminsScreen(j) : new ChatMembersScreen(j, ek22);
            case 1:
                return new ProfileEditScreen(this.b, (reb) this.c);
            default:
                Bundle bundle = (Bundle) this.c;
                Long v = i24.v("chat_id", bundle);
                long longValue = v != null ? v.longValue() : 0;
                Long v2 = i24.v("forward_id", bundle);
                return new StickerPreviewScreen(this.b, longValue, v2 != null ? v2.longValue() : 0);
        }
    }

    public /* synthetic */ edb(long j, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j;
        this.c = parcelable;
    }
}
