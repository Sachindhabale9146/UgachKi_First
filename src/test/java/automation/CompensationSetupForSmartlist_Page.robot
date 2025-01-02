*** Settings ***

Documentation 				Setup for Regenerate Library Fields
...							Setup for Smartlist
...							Create New Snapshot

...	Author					Manoj Kumar

Suite Setup     			Open Connection With Valid Credintials   ${ADMIN}   ${PASSWORD}
Suite Teardown 	 				 Suite Teardown Keyword

Default Tags				0setup
Resource					./../../PTRC/Performance/Impressions/resources/TestManageImpressions_Resource.robot
Resource          			../../PTRC/Compensation/Resources/SnapshotManager_Resource.robot
Resource         			./../../Analytics/SanityAutomation/resources/Sanity_FlatListReport_CsvTRQ.robot	


*** Test Cases ***
1.Regenerate Library Fields
	Go To 								${HttpContextType}://${SERVER}/Saba/api/compensation/meta/diag/generate
	
2.Setup Smartlist
	Go To								${HttpContextType}://${SERVER}/Saba/api/smartlists/sync/trigger?sync=true
	Wait Until Page Contains			Profiles are being synchronized on the JET server. Please check status page for more details.
	
3.Setup Metadata
	Go To								${HttpContextType}://${SERVER}/Saba/api/smartlists/metadata?sync=true
	Wait Until Page Contains			Metadata successfully imported
	Go To								${HttpContextType}://${SERVER}/Saba/Web_wdk/${TENANT}/index/prelogin.rdf
	
4.Logout User
	Logout User

5.Login With Comp Admin
	Login With Given User Name			${SUPERUSER2}					${PASSWORD}

6.Generate Indexes
	Go To Tab							Admin
	Navigate To			${Admin_System}									${Admin_Manage_Search}
	Generate Index1
	
7.Create New Snapshot
	Navigate Snapshot Manager
	Create New Snapshot from Configuration
	
	Logout User	
