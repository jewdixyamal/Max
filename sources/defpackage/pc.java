package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: pc  reason: default package */
public final class pc extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public /* synthetic */ pc() {
    }

    public final void handleMessage(Message message) {
        rg8 rg8;
        Message message2 = message;
        switch (this.a) {
            case 0:
                int i = message2.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message2.obj).onClick((DialogInterface) this.b.get(), message2.what);
                    return;
                } else if (i == 1) {
                    ((DialogInterface) message2.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                tec tec = (tec) this.b.get();
                if (tec != null) {
                    int i2 = message2.what;
                    int i3 = message2.arg1;
                    int i4 = message2.arg2;
                    Object obj = message2.obj;
                    Bundle peekData = message.peekData();
                    SparseArray sparseArray = tec.h;
                    wec wec = null;
                    yec yec = tec.i;
                    switch (i2) {
                        case 0:
                            if (i3 == tec.g) {
                                tec.g = 0;
                                if (yec.y0 == tec) {
                                    if (yec.B0) {
                                        yec.toString();
                                    }
                                    yec.l();
                                }
                            }
                            if (((vec) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (tec.f == 0 && i3 == tec.g && i4 >= 1) {
                                    tec.g = 0;
                                    tec.f = i4;
                                    vg8 b2 = vg8.b(bundle);
                                    if (yec.y0 == tec) {
                                        if (yec.B0) {
                                            yec.toString();
                                            Objects.toString(b2);
                                        }
                                        yec.g(b2);
                                    }
                                    if (yec.y0 == tec) {
                                        yec.z0 = true;
                                        ArrayList arrayList = yec.v0;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((uec) arrayList.get(i5)).b(yec.y0);
                                        }
                                        bg8 bg8 = yec.X;
                                        if (bg8 != null) {
                                            tec tec2 = yec.y0;
                                            int i6 = tec2.d;
                                            tec2.d = i6 + 1;
                                            tec2.b(10, i6, 0, bg8.a, (Bundle) null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                vec vec = (vec) sparseArray.get(i3);
                                if (vec != null) {
                                    sparseArray.remove(i3);
                                    vec.a(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (peekData != null) {
                                    peekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((vec) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    Objects.toString(bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (tec.f != 0) {
                                    vg8 b3 = vg8.b(bundle4);
                                    if (yec.y0 == tec) {
                                        if (yec.B0) {
                                            yec.toString();
                                            Objects.toString(b3);
                                        }
                                        yec.g(b3);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                vec vec2 = (vec) sparseArray.get(i3);
                                if (bundle5 != null && bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    vec2.a(bundle5);
                                    break;
                                } else {
                                    vec2.getClass();
                                    Objects.toString(bundle5);
                                    break;
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (tec.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    zf8 zf8 = bundle7 != null ? new zf8(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            rg8 = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            rg8 = new rg8(bundle9 != null ? new zf8(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(rg8);
                                    }
                                    if (yec.y0 == tec) {
                                        if (yec.B0) {
                                            yec.toString();
                                            Objects.toString(arrayList2);
                                        }
                                        Iterator it2 = yec.v0.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                uec uec = (uec) it2.next();
                                                if (uec.a() == i4) {
                                                    wec = uec;
                                                }
                                            }
                                        }
                                        if (wec instanceof wec) {
                                            wec.l(zf8, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (yec.y0 == tec) {
                                ArrayList arrayList3 = yec.v0;
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        uec uec2 = (uec) it3.next();
                                        if (uec2.a() == i4) {
                                            wec = uec2;
                                        }
                                    }
                                }
                                yt8 yt8 = yec.A0;
                                if (yt8 != null && (wec instanceof tg8)) {
                                    tg8 tg8 = (tg8) wec;
                                    ah8 ah8 = (ah8) ((zec) ((xu3) yt8.b).c);
                                    if (ah8.s == tg8) {
                                        ah8.h(ah8.c(), 2);
                                    }
                                }
                                arrayList3.remove(wec);
                                wec.c();
                                yec.m();
                                break;
                            }
                            break;
                    }
                    if (yec.B0) {
                        message.toString();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pc(tec tec) {
        this.b = new WeakReference(tec);
    }
}
