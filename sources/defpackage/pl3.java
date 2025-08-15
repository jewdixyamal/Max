package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: pl3  reason: default package */
public final class pl3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final nl3 i;
    public final int j;
    public final ol3 k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final kl3 u;
    public final int[] v;
    public final ml3 w;

    public pl3(hl3 hl3) {
        this.a = hl3.a;
        this.b = hl3.d;
        this.c = hl3.b;
        this.d = hl3.c;
        this.e = hl3.e;
        ArrayList arrayList = new ArrayList(hl3.f);
        arrayList.removeIf(new fl3(0));
        arrayList.sort(Comparator.comparing(new gl3(0)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = hl3.g;
        this.h = hl3.h;
        this.i = hl3.i;
        this.j = hl3.j;
        this.k = hl3.k;
        this.l = hl3.l;
        this.m = hl3.m;
        this.n = hl3.n;
        this.o = hl3.o;
        this.p = hl3.p;
        this.q = hl3.q;
        this.r = hl3.r;
        this.s = hl3.s;
        this.t = hl3.t;
        this.u = hl3.u;
        this.v = hl3.v;
        this.w = hl3.w;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, hl3] */
    public static pl3 b(byte[] bArr) {
        ol3 ol3;
        int i2;
        byte[] bArr2 = b.a;
        try {
            Protos.Contact contact = (Protos.Contact) qw8.mergeFrom(new Protos.Contact(), bArr);
            ? obj = new Object();
            obj.a = contact.serverId;
            obj.b = contact.baseUrl;
            obj.c = contact.baseRawUrl;
            obj.d = contact.deviceAvatarUrl;
            obj.e = contact.photoId;
            obj.g = contact.lastUpdateTime;
            obj.h = contact.serverPhone;
            obj.m = contact.settings;
            obj.o = contact.description;
            obj.p = contact.link;
            obj.q = contact.birthday;
            obj.r = contact.lastSearchClickTime;
            obj.s = contact.lastSyncTime;
            obj.t = contact.lastShowingUnknownContactBar;
            obj.v = contact.profileOptions;
            Protos.Contact.MenuButton menuButton = contact.menuButton;
            obj.u = menuButton == null ? null : new kl3(menuButton.text);
            Protos.Contact.StartMessage startMessage = contact.startMessage;
            if (startMessage != null) {
                String str = startMessage.text;
                Protos.MessageElement[] messageElementArr = startMessage.elements;
                ArrayList a2 = (messageElementArr == null || messageElementArr.length <= 0) ? null : ou8.a(messageElementArr);
                Protos.Attaches.Attach attach = contact.startMessage.media;
                l20 c2 = attach != null ? b.c(attach) : null;
                if (str != null) {
                    obj.w = new ml3(c2, str, a2);
                }
            }
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = contact.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str2 = contactName.name;
                    String str3 = contactName.lastName;
                    il3 il3 = il3.o;
                    int i3 = contactName.type;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            il3 = il3.a;
                        } else if (i3 == 2) {
                            il3 = il3.b;
                        } else if (i3 == 3) {
                            il3 = il3.c;
                        }
                    }
                    arrayList.add(new jl3(str2, il3, str3));
                }
            }
            obj.f = arrayList;
            int i4 = contact.status;
            obj.i = i4 != 1 ? i4 != 2 ? null : nl3.b : nl3.a;
            int i5 = contact.type;
            if (i5 == 0) {
                ol3 = ol3.a;
            } else if (i5 == 1) {
                ol3 = ol3.b;
            } else {
                throw new IllegalArgumentException("unknown proto.type " + contact.type);
            }
            obj.k = ol3;
            int i6 = contact.gender;
            if (i6 == 0) {
                i2 = 1;
            } else if (i6 == 1) {
                i2 = 2;
            } else if (i6 == 2) {
                i2 = 3;
            } else {
                throw new IllegalArgumentException("unknown proto.gender " + contact.gender);
            }
            obj.l = i2;
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = contact.options;
            if (iArr != null && iArr.length > 0) {
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = iArr[i7];
                    arrayList2.add(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? null : ll3.o : ll3.c : ll3.b : ll3.a);
                }
            }
            obj.n = arrayList2;
            return obj.a();
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((jl3) list.get(0)).equals(jl3.e);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hl3] */
    public final hl3 c() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.b;
        obj.e = this.e;
        obj.f = new ArrayList(this.f);
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = new ArrayList(this.n);
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.t;
        obj.u = this.u;
        obj.v = this.v;
        return obj;
    }

    public final byte[] d() {
        int i2;
        int i3;
        byte[] bArr = b.a;
        Protos.Contact contact = new Protos.Contact();
        contact.serverId = this.a;
        String str = "";
        String str2 = this.c;
        if (str2 == null) {
            str2 = str;
        }
        contact.baseUrl = str2;
        String str3 = this.d;
        if (str3 == null) {
            str3 = str;
        }
        contact.baseRawUrl = str3;
        String str4 = this.b;
        if (str4 == null) {
            str4 = str;
        }
        contact.deviceAvatarUrl = str4;
        contact.photoId = this.e;
        contact.lastUpdateTime = this.g;
        contact.serverPhone = this.h;
        contact.settings = this.m;
        String str5 = this.o;
        if (str5 == null) {
            str5 = str;
        }
        contact.description = str5;
        String str6 = this.p;
        if (str6 == null) {
            str6 = str;
        }
        contact.link = str6;
        String str7 = this.q;
        if (str7 == null) {
            str7 = str;
        }
        contact.birthday = str7;
        contact.lastSearchClickTime = this.r;
        contact.lastSyncTime = this.s;
        contact.lastShowingUnknownContactBar = this.t;
        contact.profileOptions = this.v;
        List list = this.f;
        if (!list.isEmpty()) {
            int size = list.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i4 = 0; i4 < size; i4++) {
                jl3 jl3 = (jl3) list.get(i4);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str8 = jl3.a;
                if (str8 == null) {
                    str8 = str;
                }
                contactName.name = str8;
                String str9 = jl3.b;
                if (str9 == null) {
                    str9 = str;
                }
                contactName.lastName = str9;
                int ordinal = jl3.c.ordinal();
                if (ordinal == 0) {
                    i3 = 1;
                } else if (ordinal == 1) {
                    i3 = 2;
                } else if (ordinal == 2) {
                    i3 = 3;
                } else if (ordinal == 3) {
                    i3 = 0;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contactName.type = i3;
                contact.names[i4] = contactName;
            }
        }
        nl3 nl3 = this.i;
        if (nl3 == null) {
            contact.status = 0;
        } else if (nl3 == nl3.a) {
            contact.status = 1;
        } else if (nl3 == nl3.b) {
            contact.status = 2;
        } else {
            throw new IllegalArgumentException("unknown status " + nl3);
        }
        int ordinal2 = this.k.ordinal();
        if (ordinal2 == 0) {
            contact.type = 0;
        } else if (ordinal2 == 1) {
            contact.type = 1;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        int s2 = au1.s(this.l);
        if (s2 == 0) {
            contact.gender = 0;
        } else if (s2 == 1) {
            contact.gender = 1;
        } else if (s2 == 2) {
            contact.gender = 2;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        kl3 kl3 = this.u;
        if (kl3 != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str10 = kl3.a;
            if (str10 == null) {
                str10 = str;
            }
            menuButton.text = str10;
            contact.menuButton = menuButton;
        }
        List list2 = this.n;
        if (!list2.isEmpty()) {
            contact.options = new int[list2.size()];
            for (int i5 = 0; i5 < contact.options.length; i5++) {
                int ordinal3 = ((ll3) list2.get(i5)).ordinal();
                if (ordinal3 == 0) {
                    i2 = 0;
                } else if (ordinal3 == 1) {
                    i2 = 1;
                } else if (ordinal3 == 2) {
                    i2 = 2;
                } else if (ordinal3 == 3) {
                    i2 = 3;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contact.options[i5] = i2;
            }
        }
        ml3 ml3 = this.w;
        if (ml3 != null) {
            Protos.Contact.StartMessage startMessage = new Protos.Contact.StartMessage();
            String str11 = ml3.b;
            if (str11 != null) {
                str = str11;
            }
            startMessage.text = str;
            l20 l20 = ml3.a;
            if (l20 != null) {
                startMessage.media = b.d(l20);
            } else {
                startMessage.media = null;
            }
            List list3 = ml3.c;
            if (list3 != null) {
                startMessage.elements = ou8.c(list3).elements;
            } else {
                startMessage.elements = null;
            }
            contact.startMessage = startMessage;
        }
        return qw8.toByteArray(contact);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pl3.class.getSimpleName());
        sb.append("{serverId=");
        sb.append(this.a);
        sb.append(",baseUrl=");
        sb.append(this.c);
        sb.append(",names=");
        sb.append(this.f);
        sb.append(",type=");
        sb.append(this.k);
        sb.append(",options=");
        sb.append(this.n);
        sb.append(",lastSyncTime=");
        return zr6.k(sb, this.s, "}");
    }
}
