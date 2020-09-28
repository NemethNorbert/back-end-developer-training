package com.liferay.training.gogo.command;

import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.UserLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author norbertnemeth
 */
@Component(
	immediate = true,
	property = {"osgi.command.scope=blade", "osgi.command.function=portalstats"
		// TODO enter required service properties
	},
	service = Object.class
)
public class TrainingCommand {

	// TODO enter required service methods

	public void portalstats() { System.out.println(
		"# of users: " + _userLocalService.getUsersCount()); System.out.println(
		"# of groups: " + _groupLocalService.getGroupsCount());
	}

	 @Reference
	 GroupLocalService _groupLocalService;

	 @Reference
	 UserLocalService _userLocalService;
	    
}
