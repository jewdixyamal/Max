package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: zo7  reason: default package */
public final class zo7 extends jp7 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo7(Executor executor, y7g y7g, ContentResolver contentResolver, int i) {
        super(executor, y7g);
        this.c = i;
        this.d = contentResolver;
    }

    public final g05 d(wv6 wv6) {
        g05 g05;
        InputStream inputStream;
        ContentResolver contentResolver = this.d;
        switch (this.c) {
            case 0:
                Uri uri = wv6.b;
                Uri uri2 = e9f.a;
                if (uri.getPath() != null && "content".equals(e9f.b(uri)) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(e9f.a.getPath())) {
                    if (uri.toString().endsWith("/photo")) {
                        inputStream = contentResolver.openInputStream(uri);
                    } else if (uri.toString().endsWith("/display_photo")) {
                        try {
                            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (openAssetFileDescriptor != null) {
                                inputStream = openAssetFileDescriptor.createInputStream();
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        } catch (IOException unused) {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    } else {
                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (openContactPhotoInputStream != null) {
                            inputStream = openContactPhotoInputStream;
                        } else {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    }
                    if (inputStream != null) {
                        return c(inputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (e9f.d(uri)) {
                    try {
                        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        if (openFileDescriptor != null) {
                            g05 c2 = c(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
                            openFileDescriptor.close();
                            g05 = c2;
                            if (g05 != null) {
                                return g05;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (FileNotFoundException unused2) {
                        g05 = null;
                    }
                }
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    return c(openInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.".toString());
            default:
                InputStream openInputStream2 = contentResolver.openInputStream(wv6.b);
                if (openInputStream2 != null) {
                    return c(openInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream".toString());
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
