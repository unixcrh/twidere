package org.mariotaku.twidere.fragment;

import java.util.List;

import org.mariotaku.twidere.loader.UserListSubscriptionsLoader;
import org.mariotaku.twidere.model.ParcelableUserList;

import android.support.v4.content.Loader;

public class UserListSubscriptionsFragment extends BaseUserListsListFragment {

	@Override
	public Loader<List<ParcelableUserList>> newLoaderInstance(final long account_id, final long user_id,
			final String screen_name) {
		return new UserListSubscriptionsLoader(getActivity(), account_id, user_id, screen_name, getCursor(), getData());
	}

}
