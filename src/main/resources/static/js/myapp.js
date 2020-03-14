var app= angular.module("myapp", ['ui.router']);


app.config(function($stateProvider,$urlRouterProvider){
	$stateProvider.state('collaborateur',{
		url:'/collaborateur',
		templateUrl:'views/collaborateur.html',
		controller:'collaborateurController'
	});
	$stateProvider.state('groupe',{
		url:'/groupe',
		templateUrl:'views/groupe.html',
		controller:'groupeController'
	});
	$stateProvider.state('repos',{
		url:'/repos',
		templateUrl:'views/repos.html',
		controller:'reposController'
	});
	$stateProvider.state('absence',{
		url:'/absence',
		templateUrl:'views/absence.html',
		controller:'absenceController'
	});
	$stateProvider.state('home',{
		url:'/home',
		templateUrl:'views/home.html',
		controller:'HomeController'
	});

	$stateProvider.state('chercher',{
		url:'/chercher',
		templateUrl:'views/chercher.html',
		controller:'myappController'
	});

	$stateProvider.state('ajouter',{
		url:'/ajouter',
		templateUrl:'views/ajouter.html',
		controller:'ajouterController'
	});
	$stateProvider.state('modifier',{
		url:'/modifier',
		templateUrl:'views/modifier.html',
		controller:'modifierController'
	});
	
	$stateProvider.state('cherchergroupe',{
		url:'/cherchergroupe',
		templateUrl:'views/cherchergroupe.html',
		controller:'cherchergroupeController'
	});
	$stateProvider.state('ajoutergroupe',{
		url:'/ajoutergroupe',
		templateUrl:'views/ajoutergroupe.html',
		controller:'ajoutergroupeController'
	});
	$stateProvider.state('ajouterabsence',{
		url:'/ajouterabsence',
		templateUrl:'views/ajouterabsence.html',
		controller:'ajouterabsenceController'
	});
	$stateProvider.state('affichertableau',{
		url:'/affichertableau',
		templateUrl:'views/affichertableau.html',
		controller:'affichertableauController'
	});
	$stateProvider.state('afficherrepos',{
		url:'/afficherrepos',
		templateUrl:'views/afficherrepos.html',
		controller:'afficherreposController'
	});
	$stateProvider.state('ajouterrepos',{
		url:'/ajouterrepos',
		templateUrl:'views/ajouterrepos.html',
		controller:'ajouterreposController'
	});
	$stateProvider.state('supprimerrepos',{
		url:'/supprimerrepos',
		templateUrl:'views/supprimerrepos.html',
		controller:'supprimerreposController'
	});
	$stateProvider.state('supprimerabsence',{
		url:'/supprimerabsence',
		templateUrl:'views/supprimerabsence.html',
		controller:'supprimerabsenceController'
	});
	$stateProvider.state('planning',{
		url:'/planning',
		templateUrl:'views/planning.html',
		controller:'planningController'
	});


	

	
	

	









});



app.controller('supprimerabsenceController',function($scope,$http){
	
	
	
	
	
	
	
	
	
	
	

	$scope.absenceid=null;
	$scope.absence=null;
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.mode=0;
	
	

	
	
	$scope.chercherabsence=function(){
		$http.get("absence/"+$scope.absenceid)
		.success(function(data){
			
		   $scope.absence=data;
		   $scope.mode=1;
		   
		  
		  
			
			})
			.error(function(data){
			$scope.exception.message=data.message
		});
			
	
		$scope.modeForm=function(){
			$scope.absence=null;
			$scope.mode=0;
			
			
		};
		
		};

	
	
	$scope.supprimer = function() {
	 
		$http.delete("/absence/"+$scope.absenceid)
		.success(function(data){
			
				$scope.repos=null;
			
				
				
		
			
			})
			.error(function(data){
					$scope.exception.message=data.message});
	}
	
	
	

	 $scope.updateAbsence = function() {

		    //$http PUT function
		    $http({

		      method: 'PUT',
		      url: '/absences/' + $scope.absenceid,
		      data: $scope.absence

		    }).then(function successCallback(response) {

		      alert("User has updated Successfully")

		    }, function errorCallback(response) {

		      alert("Error. while updating user Try Again!");

		    });

		  };

	
	 $scope.editAbsence = function(absence) {

		    $scope.absence = absence;
		    $scope.submit = false;
		    $scope.update = true;
	 };
	
	
		
	
	

		
	

	
	
});

app.controller('supprimerreposController',function($scope,$http){

	$scope.reposid=null;
	$scope.repos=null;
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.mode=0;
	
	

	
	
	$scope.chercherrepos=function(){
		$http.get("repos/"+$scope.reposid)
		.success(function(data){
			
		   $scope.repos=data;
		   $scope.mode=1;
		   
		  
		  
			
			})
			.error(function(data){
					$scope.exception.message=data.message;
			});
	
		$scope.modeForm=function(){
			$scope.repos=null;
			$scope.mode=0;
			
			
		};
		
		};

	
	
	$scope.supprimer = function() {
	 
		$http.delete("/repos/"+$scope.reposid)
		.success(function(data){
			
				$scope.repos=null;
			
				
				
			
		 
		
				
			})
			.error(function(data){
					$scope.exception.message=data.message});
	}
	
	
	 $scope.updateRepos = function() {

		    //$http PUT function
		    $http({

		      method: 'PUT',
		      url: '/repos/' + $scope.reposid,
		      data: $scope.repos

		    }).then(function successCallback(response) {

		      alert(" updated Successfully")

		    }, function errorCallback(response) {

		      alert("Error. while updating user Try Again!");

		    });

		  };

	
	 $scope.editRepos = function(repos) {

		    $scope.repos = repos;
		    $scope.submit = false;
		    $scope.update = true;
	 };
	
	

		
	

	
	
	
	
	
	
	
	
	
});
app.controller('planningController',function($scope,$http){});
app.controller('collaborateurController',function($scope,$http){});
app.controller('groupeController',function($scope,$http){});
app.controller('reposController',function($scope,$http){});
app.controller('absenceController',function($scope,$http){});



/*app.controller('affichertableauController',function($scope,$http){
	
	
	$scope.motCle=null;
	$scope.pageAbsences={};
	$scope.pageCourante=0;
	$scope.size=1;
	$scope.pages=[];
	
	$scope.chercherAbsences=function(){
		
		$http.get("http://localhost:8080/chercherAbsences?mc="+$scope.motCle
		+"$page="+$scope.pageCourante+"$size="+$scope.size)
		.success(function(data)
				{
			$scope.pageAbsences=data;
			$scope.pages=new Array(data.totalPages)
				});
	};
	
	
	
	
	
});*/









app.controller('afficherreposController',function($scope,$http){
	
	$scope.errors=null;
	$scope.exception={message:null}
		$scope.motCle=null;
		$scope.repos=[];
		$scope.pageCourante=0;


		$scope.chargerdate=function(){

			$http.get("/reposParMC?mc="+$scope.motCle+"&page="+$scope.pageCourante)
			.success(function(data)
					{
				$scope.repos=data;
				$scope.pages=new Array(data.totalPages)
				
				
		});

		};
		$scope.gotoPage=function(p){
			$scope.pageCourante=p;
			$scope.chargerdate();
		}



		});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


app.controller('ajouterreposController',function($scope,$http){
	$scope.errors=null;
	$scope.exception={message:null}
$scope.rps={
		 terminal: null,
		    availableOptions: [
		      { name: 'DTC'},
		      { name: 'DTV'},
		      {name: 'DTP'}
		    ],
  fonction: null,
          available: [
  { nom: 'Conducteurs engins de levage'},
  { nom: 'techniciens engins de levage'},
  {nom: 'Chef d’escale, Agent de parc, Chef d’équipe, Chef de zone, Magasinier'},
  { nom: 'Agent de manutention'},
  { nom: 'Conducteur engins roulants'},
  { nom: 'Pointeur'},
  { nom: 'Techniciens parc'}
]
		   };

		
		


$scope.mode=0;


$scope.ajouterrepos=function(){
	 
	
	$http.post('http://localhost:8080/repos',$scope.rps)
	.success(function(data){
		$scope.repos=data;
		
		$scope.mode=1;
		
	}).error(function(data){
		$scope.exception.message=data.message
	});
}
$scope.modeForm=function(){
	$scope.rps={};
	$scope.mode=0;
	
	
};




});	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	



app.controller('affichertableauController',function($scope,$http){
	$scope.errors=null;
	$scope.exception={message:null}
$scope.motCle=null;
$scope.absences=[];
$scope.pageCourante=0;


$scope.charger=function(){

	$http.get("/absencesParMC?mc="+$scope.motCle+"&page="+$scope.pageCourante)
	.success(function(data)
			{
		$scope.absences=data;
		$scope.pages=new Array(data.totalPages)
		
		
});

};
$scope.gotoPage=function(p){
	$scope.pageCourante=p;
	$scope.charger();
}



});










app.controller('cherchergroupeController',function($scope,$http){
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.nomgroupe=null;
	$scope.groupe={};

	
	
	

	
	
	$scope.cherchergroupe=function(){
		$http.get("/groupes/"+$scope.nomgroupe)
		.success(function(data){
			$scope.groupe=data;
		
		   
		  
		  
			
			})
			.error(function(data){
				$scope.exception.message=data.message
			});
			
			
	};
	
	$scope.supprimer = function() {
		 
		$http.delete("/groupes/"+$scope.nomgroupe)
		.success(function(data){
			
				$scope.groupe=null;
			
				
				
			
		 
		
			
			})
			.error(function(data){
				$scope.exception.message=data.message
			});
	
	
	
	
	
	
	
	
	
	
	
	};
	
	
	
	
	
	
});



app.controller('HomeController',function(){});



app.controller('ajouterController',function($scope,$http){
	
	
	$scope.collab={
			 terminal: null,
			    availableOptions: [
			      { name: 'DTC'},
			      { name: 'DTV'},
			      {name: 'DTP'}
			    ],
	  fonction: null,
	          available: [
	  { nom: 'Conducteurs engins de levage'},
	  { nom: 'techniciens engins de levage'},
	  {nom: 'Chef d’escale, Agent de parc, Chef d’équipe, Chef de zone, Magasinier'},
	  { nom: 'Agent de manutention'},
	  { nom: 'Conducteur engins roulants'},
	  { nom: 'Pointeur'},
	  { nom: 'Techniciens parc'}
	]
	,nomgroupe: null,
   dispo: [
     			      { grpe: 'A'},
     			      { grpe: 'B'},
     			      {grpe: 'C'},
     			      {grpe: 'D'},
     			      {grpe: 'E'},
     			      {grpe: 'F'},
     			      {grpe: 'G'},
     			      {grpe: 'H'}
     			    ]
			   };
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.mode=0;
	
	$scope.savecollab=function(){
		
		
		$http.post('http://localhost:8080/collaborateurs',$scope.collab)
		.success(function(data){
			if(!data.errors) {
			$scope.collaborateur=data;
			$scope.errors=null;
			
			$scope.mode=1;
			
		}
	
			  else {
				$scope.errors=data;
				}
	})
	.error(function(data){
			$scope.exception.message=data.message
		});
	$scope.modeForm=function(){
		$scope.collab={};
		$scope.mode=0;
		}
	
		
	};
});
	
	
	

		 
		
			
			
	
	
	
	
	
	
	
	


		

		

	

	

		

		


/*app.controller("myappController", function($scope,$http) {
	
	$scope.matricule=null;
	$scope.pageCollaborateur=[];
	$scope.collaborateur=null;
	
	
	

	
	$scope.cherchercollaborateurs=function(){
		$http.get("/cherchercollaborateurs?matricule="+$scope.matricule+
				"$page=0$size=1")
				.success(function(data)
						{
					$scope.pageCollaborateur=data;
					$scope.pages=new Array(data.totalpages);
					
						});
						
	};
	*/



app.controller("myappController", function($scope,$http) {
	$scope.errors=null;
	$scope.exception={message:null}
	
	$scope.matricule=null;
	$scope.collaborateur=null;
	$scope.mode=0;
	
	

	
	
	$scope.chercher=function(){
		$http.get("/collaborateurs/"+$scope.matricule)
		.success(function(data){
			
		   $scope.collaborateur=data;
		   $scope.mode=1;
		   
		  
		  
			
			})
			.error(function(data){
		$scope.exception.message=data.message
	});
	
		$scope.modeForm=function(){
			$scope.collaborateur=null;
			$scope.mode=0;
			
			
		};
		
	

	
	
	
	};

	
	
	$scope.supprimer = function() {
	 
		$http.delete("/collaborateurs/"+$scope.matricule)
		.success(function(data){
			
				$scope.collaborateur=null;
			
				
				
			
		 
		
			
			})
			.error(function(err){console.log(err)});
	}
	
	
	
	 $scope.updateCollaborateur = function() {

		    //$http PUT function
		    $http({

		      method: 'PUT',
		      url: '/collaborateurs/' + $scope.matricule,
		      data: $scope.collaborateur

		    }).then(function successCallback(response) {

		      alert("User has updated Successfully")

		    }, function errorCallback(response) {

		      alert("Error. while updating user Try Again!");

		    });

		  };

	
	 $scope.editCollaborateur = function(collaborateur) {

		    $scope.collaborateur = collaborateur;
		    $scope.submit = false;
		    $scope.update = true;
	 };
	

		
	});
	

			  
	
		
	
	
	
app.controller('ajoutergroupeController',function($scope,$http){
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.grp={
			
			nomgroupe: null,
			   disponible: [
			     			      { group: 'A'},
			     			      { group: 'B'},
			     			      {group: 'C'},
			     			      {group: 'D'},
			     			      {group: 'E'},
			     			      {group: 'F'},
			     			      {group: 'G'},
			     			      {group: 'H'}
			     			    ],
			
					 terminal: null,
					    availableOptions: [
					      { name: 'DTC'},
					      { name: 'DTV'},
					      {name: 'DTP'}
					    ],
			  fonction: null,
			          available: [
			  { nom: 'Conducteurs engins de levage'},
			  { nom: 'techniciens engins de levage'},
			  {nom: 'Chef d’escale, Agent de parc, Chef d’équipe, Chef de zone, Magasinier'},
			  { nom: 'Agent de manutention'},
			  { nom: 'Conducteur engins roulants'},
			  { nom: 'Pointeur'},
			  { nom: 'Techniciens parc'}
			]
			 
					  
	};
	$scope.mode=0;
	
	$scope.ajoutergroupe=function(){
		
		
		$http.post('http://localhost:8080/groupes',$scope.grp)
		.success(function(data){
			$scope.groupe=data;
			$scope.mode=1;
			
		}).error(function(data){
			$scope.exception.message=data.message
		});
	}
	$scope.modeForm=function(){
		$scope.grp={};
		$scope.mode=0;
		
		
	};
});
	
	
		
app.controller('ajouterabsenceController',function($scope,$http){
	$scope.errors=null;
	$scope.exception={message:null}
	$scope.abs={};
	$scope.mode=0;
	
	$scope.ajouterabsence=function(){
		
		
		$http.post('http://localhost:8080/absences',$scope.abs)
		.success(function(data){
			$scope.absence=data;
			$scope.mode=1;
			
		}).error(function(data){
			$scope.exception.message=data.message
		});
	}
	$scope.modeForm=function(){
		$scope.abs={};
		$scope.mode=0;
		
		
	};
	
	
	
	
		

				
			
		
			
			

	
	
	
	
	


});

		
		
		
