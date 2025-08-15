package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: m68  reason: default package */
public final class m68 extends Handler {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m68(ii8 ii8, Looper looper) {
        super(looper);
        this.c = ii8;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference != null) {
                    Messenger messenger = (Messenger) weakReference.get();
                    o68 o68 = (o68) ((WeakReference) this.b).get();
                    if (messenger != null && o68 != null) {
                        Bundle data = message.getData();
                        bi8.a(data);
                        try {
                            int i = message.what;
                            if (i == 1) {
                                bi8.a(data.getBundle("data_root_hints"));
                                data.getString("data_media_item_id");
                                ai8 ai8 = (ai8) mf7.a(data.getParcelable("data_media_session_token"), ai8.CREATOR);
                                return;
                            } else if (i == 2) {
                                return;
                            } else {
                                if (i != 3) {
                                    message.toString();
                                    return;
                                }
                                bi8.a(data.getBundle("data_options"));
                                bi8.a(data.getBundle("data_notify_children_changed_options"));
                                String string = data.getString("data_media_item_id");
                                ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                                Parcelable.Creator<p68> creator = p68.CREATOR;
                                if (parcelableArrayList != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                        arrayList.add(mf7.a((Parcelable) parcelableArrayList.get(i2), creator));
                                    }
                                }
                                if (o68.g == messenger) {
                                    if (string != null) {
                                        au1.r(o68.e.get(string));
                                    }
                                    int i3 = q68.b;
                                    return;
                                }
                                return;
                            }
                        } catch (BadParcelableException unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public m68(o68 o68) {
        this.b = new WeakReference(o68);
    }
}
